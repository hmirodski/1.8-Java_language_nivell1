package exercise04;

import java.util.List;

public class PrintWithLambdaReferenceMethod {

    public void printWithReferenceMethod(List<String> months) {
        months.stream().forEach(System.out::println);
    }
}
