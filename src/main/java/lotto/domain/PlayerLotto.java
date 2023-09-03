package lotto.domain;

import java.util.ArrayList;
import java.util.List;

public class PlayerLotto {
    private List<Lotto> lottoList = new ArrayList<>();

    private void addLotto(Lotto lotto){
        lottoList.add(lotto);
    }

    public List<Lotto> getLottoList(){
        return lottoList;
    }
}
