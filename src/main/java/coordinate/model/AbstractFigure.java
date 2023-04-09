package coordinate.model;

import java.util.List;

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
}
