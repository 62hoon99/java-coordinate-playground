package coordinatecalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.offset;

public class PointsTest {

    @Test
    public void 두_점_사이의_거리를_계산_하는_기능() throws Exception {
        //given
        Points points1 = new Points(Arrays.asList(1, 1, 5, 5));
        Points points2 = new Points(Arrays.asList(19, 15));
        //then
        Assertions.assertThat(points1.getDistance())
                .isEqualTo(5.656854, offset(0.00099));
        Assertions.assertThat(points2.getDistance())
                .isEqualTo(0);
    }

    @Test
    public void 숫자가_홀수개면_예외_발생() throws Exception {
        //then
        Assertions.assertThatThrownBy(() -> new Points(Arrays.asList(1, 1, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void y값과_일치하는_point_리스트_반환() throws Exception {
        //given
        Points points1 = new Points(Arrays.asList(1, 1, 5, 5, 2, 5));
        //when
        List<Point> hasYPoints = points1.hasYPoints(5);
        //then
        Assertions.assertThat(hasYPoints.size()).isEqualTo(2);
    }
}
