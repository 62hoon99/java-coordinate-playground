package coordinatecalculator.domain;

import java.util.Objects;

public class Coordinate {

    private static final int MAX_NUM = 24;
    private final int num;

    public Coordinate(int num) {
        validateMax(num);
        this.num = num;
    }

    private void validateMax(int num) {
        if (num > MAX_NUM) {
            throw new IllegalArgumentException("X,Y좌표 모두 최대 " + MAX_NUM + "까지만 입력 가능합니다.");
        }
    }

    public boolean isNumEqual(int num) {
        return this.num == num;
    }

    public double subtractNum(int num) {
        return this.num - num;
    }

    public double subtractNum(Coordinate coordinate) {
        return this.num - coordinate.num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return num == that.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }
}
