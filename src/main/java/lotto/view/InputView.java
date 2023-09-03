package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INPUT_AMOUNT = "구입금액을 입력해 주세요.";
    private static final String INPUT_WINNING_NUMBERS = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER = "보너스 번호를 입력해 주세요.";
    private static final String INPUT_TYPE_ERROR = "잘못 입력하셨습니다.숫자만 입력 가능합니다.";

    public static int inputAmount(){
        System.out.println(INPUT_AMOUNT);
        return parseInt(Console.readLine());
    }

    public static String inputWinningNums(){
        System.out.println(INPUT_WINNING_NUMBERS);
        return Console.readLine();
    }

    public static int inputBonusNum(){
        System.out.println(INPUT_BONUS_NUMBER);
        return parseInt(Console.readLine());
    }

    private static int parseInt(String input){
        try {
            return Integer.parseInt(input);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException(INPUT_TYPE_ERROR);
        }
    }
}
