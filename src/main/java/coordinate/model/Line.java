package coordinate.model;

import java.util.List;

public class Line extends AbstractFigure {

    public Line(List<Point> points) {
        super(points);
    }

    @Override
    public double getArea() {
        return points.get(0).calculateDistance(points.get(1));
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return points.stream()
                .anyMatch(point -> point.equals(new Point(x, y)));
    }
}
