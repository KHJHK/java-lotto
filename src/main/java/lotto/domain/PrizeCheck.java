package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class PrizeCheck {
    private Map<Prize, Integer> playerPrize = new EnumMap<>(Prize.class);

    public PrizeCheck(PlayerLotto playerLotto, WinningLotto winningLotto){
        int correctCnt = 0;;
        for (Lotto pLotto : playerLotto.getLottoList()) {
            correctCnt = winningLotto.compareLottoNums(pLotto);
            if(correctCnt == 5){
                Prize key = Prize.comparePrize(winningLotto.compareBonusNum(pLotto));
                playerPrize.put(key, playerPrize.getOrDefault(key, 0) + 1);
            }
            if(correctCnt != 5){
                Prize key = Prize.comparePrize(winningLotto.compareLottoNums(pLotto));
                playerPrize.put(key, playerPrize.getOrDefault(key, 0) + 1);
            }
        }
    }

    public Map<Prize, Integer> getPlayerPrize(){
        return playerPrize;
    }

    public double calculateReturnRate(int amount){
        double totalPrize = 0;
        for (Prize prize : playerPrize.keySet()) {
            totalPrize += prize.getPrize() * playerPrize.get(prize);
        }
        return totalPrize / amount;
    }


}
