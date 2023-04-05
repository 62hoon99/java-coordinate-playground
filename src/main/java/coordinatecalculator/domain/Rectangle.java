package coordinatecalculator.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Rectangle {

/*    public static double calculateArea(List<Point> points) {
        return getArea(points);
    }

    private static double getArea(List<Point> points) {
        Point firstPoint = points.get(0);
        List<Point> sameLinePoint = getSameLinePoint(points, firstPoint);
        return calculateArea(firstPoint, sameLinePoint);
    }

    private static List<Point> getSameLinePoint(List<Point> points, Point firstPoint) {
        return points.stream()
                .filter(point -> point.isOnSameLine(firstPoint))
                .collect(Collectors.toList());
    }

    private static double calculateArea(Point firstPoint, List<Point> sameLinePoint) {
        double area = 1;
        for (Point point : sameLinePoint) {
            area *= firstPoint.distanceTo(point);
        }
        return area;
    }*/
}
