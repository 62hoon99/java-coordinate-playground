package rentcompany;

public class K5 implements Car {

    private static final Integer FUEL_EFFICIENCY = 13;

    private final Distance distance;

    public K5(int distance) {
        this.distance = new Distance(distance);
    }

    @Override
    public double getChargeQuantity() {
        return distance.doubleValue() / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "K5";
    }
}
