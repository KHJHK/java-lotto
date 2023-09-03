package lotto.view;

import lotto.domain.Lotto;
import lotto.domain.PlayerLotto;

public class OutputView {
    private static final String LOTTO_BUY_TEXT = "개를 구매했습니다.";
    public static void printLottoBuyCnt(int lottoCnt){
        System.out.println(lottoCnt + LOTTO_BUY_TEXT);
    }
    public static void printPlayerLottoList(PlayerLotto playerLotto){
        for (Lotto lotto : playerLotto.getLottoList())
            System.out.println(lotto);
    }

    //Rank 구현 후 구현하기
//    public static void printPirze(){}

}
