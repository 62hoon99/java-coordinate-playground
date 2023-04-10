package coordinate.model;

import java.util.Objects;

public class Point {

    public static final int UPPER_LIMIT = 24;
    public static final int LOWER_LIMIT = 1;
    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(this.x.minus(other.x), 2) + Math.pow(this.y.minus(other.y), 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Coordinate getXCoordinate() {
        return this.x;
    }

    public Coordinate getYCoordinate() {
        return this.y;
    }
}
