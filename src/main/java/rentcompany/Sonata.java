package rentcompany;

public class Sonata extends Car {

    private static final Integer FUEL_EFFICIENCY = 10;

    public Sonata(int distance) {
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
        return "Sonata";
    }
}
