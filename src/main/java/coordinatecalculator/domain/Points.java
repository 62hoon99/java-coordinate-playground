package coordinatecalculator.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Points {

    private final List<Point> points;

    public Points(List<Integer> numbers) {
        validateNumbers(numbers);
        points = getPointList(numbers);
    }

    private void validateNumbers(List<Integer> numbers) {
        if (numbers.size() % 2 == 1) {
            throw new IllegalArgumentException("올바른 좌표 값을 입력해주세요.");
        }
    }

    private List<Point> getPointList(List<Integer> numbers) {
        List<Point> pointList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += 2) {
            pointList.add(new Point(numbers.get(i), numbers.get(i + 1)));
        }
        return pointList;
    }

    public double getDistance() {
        if (!isStraight()) {
            throw new IllegalArgumentException("길이를 구할 수 없습니다.");
        }
        return points.get(0).distanceTo(points.get(1));
    }

    public List<Point> hasYPoints(int y) {
        return points.stream()
                .filter(point -> point.isYCoordinateEqual(y))
                .collect(Collectors.toList());
    }

    private boolean isRectangle() {
        return countCoordinatesOnSameLine() == 4;
    }

    private int countCoordinatesOnSameLine() {
        int count = 0;
        for (int i = 0; i < points.size(); i++) {
            if (getCountOnSameLine(i) == 2) {
                count++;
            }
        }
        return count;
    }

    private int getCountOnSameLine(int i) {
        int countOnSameLine = 0;
        for (int k = 0; k < points.size(); k++) {
            if (i != k && points.get(i).isOnSameLine(points.get(k))) {
                countOnSameLine++;
            }
        }
        return countOnSameLine;
    }

    public double getArea() {
        if (!isRectangle()) {
            throw new IllegalArgumentException("넓이를 구할 수 없습니다.");
        }
        Point firstPoint = points.get(0);
        List<Point> sameLinePoint = getSameLinePoint(firstPoint);
        return calculateArea(firstPoint, sameLinePoint);
    }

    private List<Point> getSameLinePoint(Point firstPoint) {
        return points.stream()
                .filter(point -> point.isOnSameLine(firstPoint))
                .collect(Collectors.toList());
    }

    private double calculateArea(Point firstPoint, List<Point> sameLinePoint) {
        double area = 1;
        for (Point point : sameLinePoint) {
            area *= firstPoint.distanceTo(point);
        }
        return area;
    }

    public Shape identifyShape() {
        if (isStraight()) {
            return Shape.STRAIGHT;
        }
        if (isRectangle()) {
            return Shape.RECTANGLE;
        }
        return Shape.ETC;
    }

    private boolean isStraight() {
        Set<Point> pointSet = new HashSet<>(points);
        return pointSet.size() == 2;
    }
}
