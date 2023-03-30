package rentcompany;

public class Sonata implements Car {

    private static final Integer FUEL_EFFICIENCY = 10;

    private final Distance distance;

    public Sonata(int distance) {
        this.distance = new Distance(distance);
    }

    @Override
    public double getChargeQuantity() {
        return distance.doubleValue() / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "Sonata";
    }
}
