package coordinate.model;

import java.util.List;
import java.util.Objects;

public abstract class AbstractFigure implements Figure {

    private static final String NULL_MSG = "좌표값을 입력해주세요.";
    protected final List<Point> points;

    public AbstractFigure(List<Point> points) {
        validateNull(points);
        this.points = points;
    }

    private void validateNull(List<Point> points) {
        if (points == null || points.isEmpty()) {
            throw new IllegalArgumentException(NULL_MSG);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFigure that = (AbstractFigure) o;
        return Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
