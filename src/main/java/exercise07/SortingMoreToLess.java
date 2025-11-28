package exercise07;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMoreToLess {
    public static List<Object> sortLongToShort(List<Object> list) {
        return list.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
    }
}
