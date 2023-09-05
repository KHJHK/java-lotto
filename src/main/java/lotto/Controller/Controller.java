package lotto.Controller;

import lotto.domain.LottoAmount;
import lotto.domain.PlayerLotto;
import lotto.domain.PrizeCheck;
import lotto.domain.WinningLotto;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Controller {
    public static void start(){
        try{
            LottoAmount lottoAmount = new LottoAmount(InputView.inputAmount());
            OutputView.printLottoBuyCnt(lottoAmount.lottoCount());
            PlayerLotto playerLotto = new PlayerLotto(lottoAmount.lottoCount());
            OutputView.printPlayerLottoList(playerLotto);
            WinningLotto winningLotto = new WinningLotto(InputView.inputWinningNums(), InputView.inputBonusNum());
            OutputView.printPirze(PrizeCheck.checkPrize(playerLotto, winningLotto));
            OutputView.printReturnRate(PrizeCheck.calculateReturnRate(lottoAmount.getAmount()));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

}
