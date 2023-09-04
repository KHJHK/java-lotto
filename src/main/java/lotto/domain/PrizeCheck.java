package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class PrizeCheck {
    private Map<Prize, Integer> playerPrize = new EnumMap<>(Prize.class);

    public PrizeCheck(PlayerLotto playerLotto, WinningLotto winningLotto){
        int correctCnt = 0;
        boolean isBonusCorrect = false;
        for (Lotto pLotto : playerLotto.getLottoList()) {
            isBonusCorrect = false;
            correctCnt = winningLotto.compareLottoNums(pLotto);
            if(correctCnt == 5) isBonusCorrect = winningLotto.compareBonusNum(pLotto);
        }
    }

}
