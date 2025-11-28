package exercise03;

import java.util.List;


public class PrintWithLambda {

    public static void printsWithLambda(List<String> months) {
        months.stream().forEach(month -> System.out.println(month));
    }
}
