package coordinatecalculator.view;

import coordinatecalculator.Point;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    private static final Integer MAX_NUMBER = 24;
    private static final String ROW_SPACE = "  ";

    public static void printAxis(List<Point> points) {
        printYAxis(points);
        printXAxis();
    }

    private static void printYAxis(List<Point> points) {
        for (int i = MAX_NUMBER; i > 0; i--) {
            printBlank(i);
            printNumber(i);
            printCoordinate(getPointsOnY(points, i));
        }
    }

    private static void printCoordinate(List<Point> points) {
        for (int i = 0; i < MAX_NUMBER; i++) {
            printPoint(points, i);
            System.out.print(ROW_SPACE);
        }
        System.out.println();
    }

    private static void printPoint(List<Point> points, int i) {
        points.stream()
                .filter(point -> point.isXCoordinateEqual(i))
                .findAny()
                .ifPresent(point -> System.out.print("*"));
    }

    private static List<Point> getPointsOnY(List<Point> points, int i) {
        return points.stream()
                .filter(point -> point.isYCoordinateEqual(i))
                .collect(Collectors.toList());
    }

    private static void printXAxis() {
        printXAxisLine();
        printXAxisNumber();
    }

    private static void printXAxisNumber() {
        for (int i = 0; i <= MAX_NUMBER; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ROW_SPACE + ROW_SPACE);
            }
        }
    }

    private static void printXAxisLine() {
        System.out.print("  +");
        for (int i = 0; i < MAX_NUMBER; i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    private static void printNumber(int i) {
        if (i % 2 == 0) {
            System.out.print(i);
        }
        System.out.print("|");
    }

    private static void printBlank(int i) {
        if (i % 2 == 0 && i < 10) {
            System.out.print(" ");
        }
        if (i % 2 == 1) {
            System.out.print("  ");
        }
    }
}
