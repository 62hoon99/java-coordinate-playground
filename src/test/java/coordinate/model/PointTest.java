package coordinate.model;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void 두_점_사이의_거리를_계산한다() throws Exception {
        //given
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14, 15);
        //when
        double distance = point1.calculateDistance(point2);
        //then
        Assertions.assertThat(distance).isEqualTo(6.403124, Offset.offset(0.00099));
    }
}
