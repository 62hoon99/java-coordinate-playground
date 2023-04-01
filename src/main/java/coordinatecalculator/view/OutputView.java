package coordinatecalculator.view;

import coordinatecalculator.domain.Points;
import coordinatecalculator.domain.Point;

import java.util.List;

public class OutputView {

    private static final Integer MAX_NUMBER = 24;
    private static final String ROW_SPACE = "  ";

    public static void printAxis(Points points) {
        printYAxis(points);
        printXAxis();
    }

    public static void printDistance(double distance) {
        System.out.printf("두 점 사이 거리는 %f\n", distance);
    }

    private static void printYAxis(Points points) {
        for (int i = MAX_NUMBER; i > 0; i--) {
            printBlank(i);
            printNumber(i);
            printCoordinate(points.hasYPoints(i));
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
        System.out.println();
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
