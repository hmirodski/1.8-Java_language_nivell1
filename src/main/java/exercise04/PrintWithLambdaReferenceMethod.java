package exercise04;

import java.util.List;

public class PrintWithLambdaReferenceMethod {

    public void printWithReferenceMethod(List<Integer> months) {
        months.stream().forEach(System.out::println);
    }
}
