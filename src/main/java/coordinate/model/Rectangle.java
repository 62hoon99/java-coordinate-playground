package coordinate.model;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure {

    private static final int RECTANGLE_SAME_LINE_COORDINATE_NUM = 2;
    private static final String WRONG_RECTANGLE_POINTS = "직사각형 좌표가 아닙니다.";

    public Rectangle(List<Point> points) {
        super(points);
        validateRectangle(points);
    }

    private void validateRectangle(List<Point> points) {
        Set<Coordinate> xCoordinate = getXCoordinate(points);
        Set<Coordinate> yCoordinate = getYCoordinate(points);
        if (!hasTwoCoordinate(xCoordinate) || !hasTwoCoordinate(yCoordinate)) {
            throw new IllegalArgumentException(WRONG_RECTANGLE_POINTS);
        }
    }

    private boolean hasTwoCoordinate(Set<Coordinate> coordinates) {
        return coordinates.size() == RECTANGLE_SAME_LINE_COORDINATE_NUM;
    }

    private Set<Coordinate> getYCoordinate(List<Point> points) {
        return points.stream()
                .map(Point::getYCoordinate)
                .collect(Collectors.toSet());
    }

    private Set<Coordinate> getXCoordinate(List<Point> points) {
        return points.stream()
                .map(Point::getXCoordinate)
                .collect(Collectors.toSet());
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public boolean hasPoint(int x, int y) {
        return false;
    }
}
