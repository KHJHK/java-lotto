package lotto.domain;

import java.util.EnumMap;
import java.util.Map;

public class PrizeCheck {
    private static Map<Prize, Integer> playerPrize = new EnumMap<>(Prize.class);

    public static Map<Prize, Integer> checkPrize(PlayerLotto playerLotto, WinningLotto winningLotto){
        int correctCnt = 0;;
        initPlayerPrize();
        for (Lotto pLotto : playerLotto.getLottoList()) {
            correctCnt = winningLotto.compareLottoNums(pLotto);
            if(correctCnt == 5){
                Prize key = Prize.comparePrize(winningLotto.compareBonusNum(pLotto));
                playerPrize.put(key, playerPrize.get(key) + 1);
            }
            if(correctCnt != 5){
                Prize key = Prize.comparePrize(correctCnt);
                playerPrize.put(key, playerPrize.get(key) + 1);
            }
        }

        return playerPrize;
    }

    private static void initPlayerPrize(){
        for (int correctNum = 2; correctNum <= 6; correctNum++) {
            playerPrize.put(Prize.comparePrize(correctNum), 0);
        }
        playerPrize.put(Prize.comparePrize(true), 0);
    }


    public static double calculateReturnRate(int amount){
        double totalPrize = 0;
        for (Prize prize : playerPrize.keySet()) {
            totalPrize += prize.getPrize() * playerPrize.get(prize);
        }
        return 100 * (totalPrize / amount);
    }


}
