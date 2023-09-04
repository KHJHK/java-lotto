package lotto.domain;

public class Validate {
    private static final int MIN_NUM = 1;
    private static final int MAX_NUM = 45;
    private static final String INPUT_TYPE_ERROR = "[ERROR]잘못 입력하셨습니다. 숫자만 입력 가능합니다.";
    private static final String LOTTO_OUT_OF_RANGE = "[ERROR]로또 번호는 1 ~ 45 사이의 숫자만 입력 가능합니다.";

    public static void validateLottoNumRange(int num) {
        if(num < MIN_NUM || num > MAX_NUM) throw new IllegalArgumentException(LOTTO_OUT_OF_RANGE);
    }
}
