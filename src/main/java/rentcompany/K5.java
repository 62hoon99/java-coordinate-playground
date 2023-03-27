package rentcompany;

public class K5 extends Car {

    private static final Integer FUEL_EFFICIENCY = 13;

    public K5(int distance) {
        super(distance);
    }

    @Override
    public double getDistancePerLiter() {
        return distance.doubleValue() / FUEL_EFFICIENCY;
    }

    @Override
    public double getTripDistance() {
        return distance.doubleValue();
    }

    @Override
    public String getName() {
        return "K5";
    }
}
