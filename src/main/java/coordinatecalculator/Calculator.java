package coordinatecalculator;

import coordinatecalculator.domain.Points;
import coordinatecalculator.domain.ValueExtractor;
import coordinatecalculator.view.InputView;
import coordinatecalculator.view.OutputView;

import java.util.List;

public class Calculator {

    public void start() {
        List<Integer> numbers = ValueExtractor.extractNumbers(InputView.point());
        Points points = new Points(numbers);
        OutputView.printAxis(points);
        OutputView.printDistance(points.getDistance());
    }
}
