package rentcompany;

public class Avante implements Car {

    private static final Integer FUEL_EFFICIENCY = 15;

    private final Distance distance;

    public Avante(int distance) {
        this.distance = new Distance(distance);
    }

    @Override
    public double getChargeQuantity() {
        return distance.doubleValue() / FUEL_EFFICIENCY;
    }

    @Override
    public String getName() {
        return "Avante";
    }
}
