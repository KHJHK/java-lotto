package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayerLotto {
    private List<Lotto> lottoList = new ArrayList<>();

    public PlayerLotto(int lottoCnt){
        for (int cnt = 0; cnt < lottoCnt; cnt++) addLotto(makeLotto());

    }

    public Lotto makeLotto(){
        List<Integer> pickNums = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        Collections.sort(pickNums);
        return new Lotto(pickNums);
    }

    private void addLotto(Lotto lotto){
        lottoList.add(lotto);
    }

    public List<Lotto> getLottoList(){
        return lottoList;
    }
}
