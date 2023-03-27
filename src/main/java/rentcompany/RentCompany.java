package rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");

    private final List<Car> cars;

    private RentCompany() {
        this.cars = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName())
                    .append(" : ")
                    .append(
                            Math.round(
                                    car.getDistancePerLiter()
                            )
                    )
                    .append("리터")
                    .append(NEWLINE);
        }
        return sb.toString();
    }
}
