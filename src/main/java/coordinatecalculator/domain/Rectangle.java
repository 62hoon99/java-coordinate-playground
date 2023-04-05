package coordinatecalculator.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Rectangle {

    private static final String NO_RECTANGLE_MESSAGE = "직사각형이 아닙니다.";

    public static double calculateArea(List<Point> points) {
        validateRectangle(points);
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
    }

    private static void validateRectangle(List<Point> points) {
        if (countCoordinatesOnSameLine(points) != 4) {
            throw new IllegalArgumentException(NO_RECTANGLE_MESSAGE);
        }
    }

    private static int countCoordinatesOnSameLine(List<Point> points) {
        int count = 0;
        for (int i = 0; i < points.size(); i++) {
            if (getCountOnSameLine(points, i) == 2) {
                count++;
            }
        }
        return count;
    }

    private static int getCountOnSameLine(List<Point> points, int i) {
        int countOnSameLine = 0;
        for (int k = 0; k < points.size(); k++) {
            if (i != k && points.get(i).isOnSameLine(points.get(k))) {
                countOnSameLine++;
            }
        }
        return countOnSameLine;
    }
}
