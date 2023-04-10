package coordinate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class FigureFactory {

    private static final String ERROR_INVALID_FIGURE_CREATION = "입력된 Point 개수가 유효하지 않습니다.";
    private static final String NULL_MSG = "좌표값을 입력해주세요.";
    private static final int LINE_SIZE = 2;
    private static final int RECTANGLE_SIZE = 4;
    private static final Map<Integer, Function<List<Point>, Figure>> figures = new HashMap<>();

    public static Figure create(List<Point> points) {
        setFigures();
        validateNull(points);
        validateSize(points);
        return figures.get(points.size()).apply(points);
    }

    private static void validateSize(List<Point> points) {
        figures.keySet()
                .stream()
                .filter(key -> key.equals(points.size()))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException(ERROR_INVALID_FIGURE_CREATION));
    }

    private static void setFigures() {
        figures.put(LINE_SIZE, Line::new);
        figures.put(RECTANGLE_SIZE, Rectangle::new);
    }

    private static void validateNull(List<Point> points) {
        if (points == null) {
            throw new IllegalArgumentException(NULL_MSG);
        }
    }
}
