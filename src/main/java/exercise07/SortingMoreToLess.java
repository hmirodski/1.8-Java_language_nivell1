package exercise07;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingMoreToLess {
    public static List<String> sortLongToShort(List<Object> list) {
        return list.stream()
                .filter(String.class::isInstance)
                .map(String.class::cast)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}
