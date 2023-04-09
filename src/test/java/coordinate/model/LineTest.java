package coordinate.model;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {

    @Test
    public void 두_점_사이의_거리를_계산한다() throws Exception {
        //given
        Line line = new Line(Arrays.asList(
                new Point(10, 10),
                new Point(14, 15)
        ));
        //when
        double distance = line.getArea();
        //then
        assertThat(distance).isEqualTo(6.403124, Offset.offset(0.00099));
    }
}
