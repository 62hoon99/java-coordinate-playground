package coordinatecalculator;

import java.util.ArrayList;
import java.util.List;

public class Points {

    private final List<Point> points;

    public Points(List<Integer> numbers) {
        points = getPointList(numbers);
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
        return 0;
    }
}
