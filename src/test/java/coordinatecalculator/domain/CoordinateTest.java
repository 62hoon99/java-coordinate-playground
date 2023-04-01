package coordinatecalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    public void 입력_범위를_초과할_경우_예외발생() throws Exception {
        //then
        Assertions.assertThatThrownBy(() -> new Coordinate(25))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
