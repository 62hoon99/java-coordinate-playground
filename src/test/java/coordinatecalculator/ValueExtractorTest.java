package coordinatecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValueExtractorTest {

    @Test
    public void 입력값에서_숫자를_추출하는_기능() throws Exception {
        //then
        Assertions.assertThat(ValueExtractor.extractNumbers("(10,10)-(14,15)"))
                .contains(10, 10, 14, 15);

        Assertions.assertThat(ValueExtractor.extractNumbers("(10,10)-(14,15)"))
                .doesNotContain(11, 12, 16, 17);
    }
}
