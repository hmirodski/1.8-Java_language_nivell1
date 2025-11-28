package exercise02;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByLetterOAndMoreThan5 {
    public static List<String> filter(List<String> list) {
        return list.stream()
                .filter(w -> w.contains("o"))
                .filter(x -> x.length() > 5)
                .collect(Collectors.toList());

    }
}
