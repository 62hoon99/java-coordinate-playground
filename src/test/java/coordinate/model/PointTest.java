package coordinate.model;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {

    @Test
    public void 두_점_사이의_거리를_계산한다() throws Exception {
        //given
        Point point1 = new Point(10, 10);
        Point point2 = new Point(14, 15);
        //when
        double distance = point1.calculateDistance(point2);
        //then
        assertThat(distance).isEqualTo(6.403124, Offset.offset(0.00099));
    }

    @Test
    public void 좌표값이_24_0_사이가_아닌_경우_예외() throws Exception {
        assertThrows(IllegalArgumentException.class, () ->
                new Point(25, 1)
        );
        assertThrows(IllegalArgumentException.class, () ->
                new Point(0, 25)
        );
        assertThrows(IllegalArgumentException.class, () ->
                new Point(-1, 24)
        );
        assertThrows(IllegalArgumentException.class, () ->
                new Point(24, -1)
        );
    }

    @Test
    public void x_y_가_같으면_같은_클래스() throws Exception {
        //given
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        //then
        Assertions.assertThat(point1.equals(point2)).isTrue();
    }
}
