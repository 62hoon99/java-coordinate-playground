package coordinatecalculator.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class RectangleTest {

    @Test
    public void 직사각형이면_넓이를_반환한다() throws Exception {
        //given
        List<Point> points = Arrays.asList(
                new Point(1, 1),
                new Point(1, 2),
                new Point(3, 2),
                new Point(3, 1)
        );
        //then
        Assertions.assertThat(Rectangle.calculateArea(points))
                .isEqualTo(2f);
    }
}
