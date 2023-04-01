package coordinatecalculator.domain;

import java.util.ArrayList;
import java.util.List;
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
        if (points.size() == 2) {
            return points.get(0).distanceTo(points.get(1));
        }
        return -1;
    }

    public List<Point> hasYPoints(int y) {
        return points.stream()
                .filter(point -> point.isYCoordinateEqual(y))
                .collect(Collectors.toList());
    }
}
