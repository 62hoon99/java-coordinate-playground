package coordinatecalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.offset;

public class PointTest {

    @Test
    public void 거리_계산_기능() throws Exception {
        //given
        Point point1 = new Point(1, 1);
        Point point2 = new Point(10, 10);
        //then
        Assertions.assertThat(point1.distanceTo(5, 5)).isEqualTo(5.656854, offset(0.00099));
        Assertions.assertThat(point2.distanceTo(14, 15)).isEqualTo(6.403124, offset(0.00099));
    }
}
