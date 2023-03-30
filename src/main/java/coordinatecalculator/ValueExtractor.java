package coordinatecalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValueExtractor {
    public static List<Integer> extractNumbers(String str) {
        return getNumbers(
                Pattern.compile("\\d{1,2}")
                        .matcher(str)
        );
    }

    private static List<Integer> getNumbers(Matcher matcher) {
        List<Integer> numbers = new ArrayList<>();
        while (matcher.find()) {
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers;
    }
}
