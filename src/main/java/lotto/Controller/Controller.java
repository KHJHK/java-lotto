package lotto.Controller;

import lotto.domain.LottoAmount;
import lotto.domain.PlayerLotto;
import lotto.domain.WinningLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Controller {
    public static void start(){
        try{
//            LottoAmount lottoAmount = new LottoAmount(InputView.inputAmount());
//            PlayerLotto playerLotto = new PlayerLotto(lottoAmount.lottoCount());
//            OutputView.printLottoBuyCnt(lottoAmount.lottoCount());
//            OutputView.printPlayerLottoList(playerLotto);
            WinningLotto winningLotto = new WinningLotto(InputView.inputWinningNums(), InputView.inputBonusNum());
            OutputView.printWinningLotto(winningLotto); //winningLotto input test line
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
