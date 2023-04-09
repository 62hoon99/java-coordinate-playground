package coordinate.model;

public class Point {

    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public double calculateDistance(Point other) {
        return Math.sqrt(Math.pow(this.x.minus(other.x), 2) + Math.pow(this.y.minus(other.y), 2));
    }
}
