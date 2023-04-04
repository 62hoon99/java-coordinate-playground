package coordinatecalculator.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Rectangle {
    public static double calculateArea(List<Point> points) {

        int count = 0;
        for (int i = 0; i < points.size(); i++) {
            int countOnSameLine = 0;

            for (int k = 0; k < points.size(); k++) {
                if (i != k && points.get(i).isOnSameLine(points.get(k))) {
                    countOnSameLine++;
                }
            }

            if (countOnSameLine == 2) {
                count++;
            }
        }

        if (count != 4) {
            return -1;
        }

        Point firstPoint = points.get(0);
        List<Point> sameLinePoint = points.stream()
                .filter(point -> point.isOnSameLine(firstPoint))
                .collect(Collectors.toList());

        double distance = 1;
        for (Point point : sameLinePoint) {
            distance *= firstPoint.distanceTo(point);
        }
        return distance;
    }
}
