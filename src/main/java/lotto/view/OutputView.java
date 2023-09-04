package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.PlayerLotto;
import lotto.domain.WinningLotto;

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
//    public static void printPirze(){}

}
