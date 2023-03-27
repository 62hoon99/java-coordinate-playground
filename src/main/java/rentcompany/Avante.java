package rentcompany;

public class Avante extends Car {

    private static final Integer FUEL_EFFICIENCY = 15;

    public Avante(int distance) {
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
        return "Avante";
    }
}
