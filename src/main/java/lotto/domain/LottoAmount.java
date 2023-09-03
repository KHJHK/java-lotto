package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.Collections;
import java.util.List;

public class LottoAmount {

    private static final int MIN_PAY = 1000;
    private static final String PAY_ERROR_MESSAGE = "금액은 1000원 단위로 입력 가능합니다.";
    private static final String ZERO_PAY_ERROR_MESSAGE = "금액은 1000원 이상 입력해야합니다(1000원 단위로 입력 가능).";
    private final int amount;

    public LottoAmount(int amount) {
        validateAmount(amount);
        this.amount = amount;
    }

    private void validateAmount(int amount){
        if(amount < MIN_PAY) throw new IllegalArgumentException(ZERO_PAY_ERROR_MESSAGE);
        if(amount % MIN_PAY != 0) throw new IllegalArgumentException(PAY_ERROR_MESSAGE);
    }

    public int lottoCount() {
        return amount / MIN_PAY;
    }

    public Lotto makeLotto(){
        List<Integer> pickNums = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(pickNums);
        return new Lotto(pickNums);
    }

}
