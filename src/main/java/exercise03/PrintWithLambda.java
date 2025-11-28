package exercise03;

import java.util.List;
import java.util.stream.Collectors;

public class PrintWithLambda {

    public void printsWithLambda(List<String> months) {
        months.stream().forEach(month -> System.out.println(month));
    }
}
