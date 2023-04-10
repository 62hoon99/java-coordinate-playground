package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    private List<Point> points;
    private Rectangle rectangle;

    @BeforeEach
    public void set() {
        this.points = Arrays.asList(
                new Point(1, 3),
                new Point(1, 6),
                new Point(5, 3),
                new Point(5, 6)
        );
        this.rectangle = new Rectangle(points);
    }

    @Test
    public void 직사각형_생성() throws Exception {
        //given
        Rectangle rectangle = new Rectangle(points);
        //then
        assertThat(rectangle).isEqualTo(this.rectangle);
    }

    @Test
    public void 직사각형_생성_오류() throws Exception {
        //given
        List<Point> strangePoints = Arrays.asList(
                new Point(1, 4),
                new Point(1, 5),
                new Point(3, 3),
                new Point(3, 5)
        );
        //then
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(strangePoints);
        });
    }

    @Test
    public void 직사각형_넓이_계산() throws Exception {
        //when
        double area = rectangle.getArea();
        //then
        assertThat(area).isEqualTo(12);
    }

    @Test
    public void point를_갖고있는지_확인() throws Exception {
        //when
        boolean trueAnswer = rectangle.hasPoint(1, 3);
        boolean falseAnswer = rectangle.hasPoint(1, 4);
        //then
        assertThat(trueAnswer).isTrue();
        assertThat(falseAnswer).isFalse();
    }
}
