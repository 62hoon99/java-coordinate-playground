package coordinate.model;

public class Coordinate {

    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 24;
    private static final String INPUT_OUT_OF_RANGE_MSG = "좌표는 0에서 24사이의 정수만 입력 가능합니다.";

    private final int num;

    public Coordinate(int num) {
        validateRange(num);
        this.num = num;
    }

    private static void validateRange(int num) {
        if (num < MIN_NUM || num > MAX_NUM) {
            throw new IllegalArgumentException(INPUT_OUT_OF_RANGE_MSG);
        }
    }

    public int minus(Coordinate other) {
        return this.num - other.num;
    }
}
