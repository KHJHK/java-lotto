package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Lotto {
    private static final int LOTTO_CNT = 6;
    private static final String NUM_CNT_ERROR = "로또 번호의 개수는 " + LOTTO_CNT + "개 입니다.";
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    //로또번호가 6개가 아니면 Error
    private void validate(List<Integer> numbers) {
        if (numbers.size() != LOTTO_CNT) {
            throw new IllegalArgumentException(NUM_CNT_ERROR);
        }
    }

    // TODO: 추가 기능 구현
    public List<Integer> getNumbers(){
        return numbers;
    }

}