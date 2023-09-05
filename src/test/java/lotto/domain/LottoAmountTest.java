package lotto.domain;

import lotto.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class LottoAmountTest {


    @Test
    @DisplayName("구매한 로또 개수 체크")
    void calculateLottoCount() {
        LottoAmount lottoAmount = new LottoAmount(1000);
        assertThat(lottoAmount.lottoCount()).isEqualTo(1);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 1234})
    @DisplayName("올바르지 않은 입력(형식에 맞지 않는 숫자)")
    void failed(int input) {

        assertThatThrownBy(() -> new LottoAmount(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}