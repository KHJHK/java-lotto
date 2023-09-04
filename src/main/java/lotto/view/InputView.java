package lotto.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class InputView {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 45;
    private static final int LOTTO_SIZE_CNT = 6;
    private static final String INPUT_AMOUNT = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_NUMBERS = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    private static final String INPUT_TYPE_ERROR = "[ERROR]잘못 입력하셨습니다. 숫자만 입력 가능합니다.";
    private static final String LOTTO_NUM_OUT_OF_RANGE = "[ERROR]로또 번호는 1 ~ 45 사이의 숫자만 입력 가능합니다.";
    private static final String LOTTO_NUMS_OUT_OF_SIZE = "[ERROR]로또 번호는 6자리가 입력되어야 합니다.";

    public static int inputAmount(){
        System.out.println(INPUT_AMOUNT);
        return parseInt(Console.readLine());
    }

    public static List<Integer> inputWinningNums(){
        System.out.println(INPUT_WINNING_NUMBERS);
        return parseStrNumsToInt(Console.readLine());
    }

    public static int inputBonusNum(){
        System.out.println(INPUT_BONUS_NUMBER);
        int bonusNum = parseInt(Console.readLine());
        validateLottoNumRange(bonusNum);
        return bonusNum;
    }

    private static int parseInt(String input){
        try {
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(INPUT_TYPE_ERROR);
        }
    }

    //쉼표 없는 입력도 걸려야함 - ERROR 잡기
    private static List<Integer> parseStrNumsToInt(String input){
        List<Integer> winningLottoNums = new ArrayList<>();
        for (String numStr:input.split(",")) {
            int num = parseInt(numStr);
            validateLottoNumRange(num);
            winningLottoNums.add(num);
        }
        if(winningLottoNums.size() != LOTTO_SIZE_CNT) throw new IllegalArgumentException(LOTTO_NUMS_OUT_OF_SIZE);

        return winningLottoNums;
    }

    private static void validateLottoNumRange(int num) {
        if(num < MIN_NUM || num > MAX_NUM) throw new IllegalArgumentException(LOTTO_NUM_OUT_OF_RANGE);
    }
}
