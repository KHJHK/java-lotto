package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.PlayerLotto;
import lotto.domain.Prize;
import lotto.domain.WinningLotto;

import java.util.Map;

public class OutputView {
    private static final String LOTTO_BUY_TEXT = "개를 구매했습니다.";
    public static void printLottoBuyCnt(int lottoCnt){
        System.out.println(lottoCnt + LOTTO_BUY_TEXT);
    }
    public static void printPlayerLottoList(PlayerLotto playerLotto){
        for (Lotto lotto : playerLotto.getLottoList())
            System.out.println(lotto.getNumbers().toString());
    }

    //test용 임시 method
    public static void printWinningLotto(WinningLotto winningLotto){
        System.out.println(winningLotto.getWinningLotto().getNumbers().toString());
        System.out.println(winningLotto.getBonusNum());
    }

    //Rank 구현 후 구현하기
    public static void printPirze(Map<Prize, Integer> playerPrize){
        for(Map.Entry<Prize, Integer> prizes: playerPrize.entrySet()){
            Prize prize = prizes.getKey();
            if(prize.getCorrectCnt() == 0){
                continue;
            }
            System.out.printf("%d개 일치 ", prize.getCorrectCnt());
            if(prize.getIsBonusCorrect()){
                System.out.print(", 보너스 볼 일치 ");
            }
            System.out.printf("(%d원) - %d개\n", prize.getPrize(), prizes.getValue());
        }
    }

    public static void printReturnRate(double returnRate){
        System.out.printf("총 수익률은 %.2f%s입니다", returnRate, '%');
    }

}
