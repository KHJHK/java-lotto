package lotto.view;

import lotto.domain.LottoAmount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {
    @Test
    @ValueSource(strings = {"-1", "0"})
    @DisplayName("올바르지 않은 금액")
    void failed(String input) {
        assertThatThrownBy(() -> InputView.parseInt(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

}