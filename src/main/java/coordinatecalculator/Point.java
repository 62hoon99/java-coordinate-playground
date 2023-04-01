package coordinatecalculator;

public class Point {

    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = new Coordinate(x);
        this.y = new Coordinate(y);
    }

    public double distanceTo(int x, int y) {
        return Math.sqrt(Math.pow(this.x.subtractNum(x), 2) + Math.pow(this.y.subtractNum(y), 2));
    }

    public boolean isYCoordinateEqual(int y) {
        return this.y.isNumEqual(y);
    }

    public boolean isXCoordinateEqual(int x) {
        return this.x.isNumEqual(x);
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(this.x.subtractNum(point.x), 2) + Math.pow(this.y.subtractNum(point.y), 2));
    }
}
