package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class PrizeCheck {
    private Map<Prize, Integer> playerPrize = new EnumMap<>(Prize.class);

    public PrizeCheck(PlayerLotto playerLottos, WinningLotto winningLotto){
        int correctCnt = 0;
        boolean isBonusCorrect = false;
        for (Lotto playerLotto : playerLottos.getLottoList()) {
            correctCnt = winningLotto.compareLottoNums(playerLotto);
            isBonusCorrect = winningLotto.compareBonusNum(playerLotto);
        }


    }

}
