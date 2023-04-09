package coordinate.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class FigureFactoryTest {

    @Test
    public void 입력된_좌표값에_따라_맞는_구현체를_반환() throws Exception {
        //given
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(1, 2));
        //when
        Figure figure = FigureFactory.create(points);
        //then
        Assertions.assertThat(figure).isInstanceOf(Line.class);
    }
}
