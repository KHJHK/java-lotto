package lotto.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
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

}