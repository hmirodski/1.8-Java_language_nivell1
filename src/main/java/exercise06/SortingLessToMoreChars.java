package exercise06;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingLessToMoreChars {
    public static List<Object> sortShortToLong(List<Object> list){
        return list.stream()
                .filter(e -> e instanceof String)
                .map(e -> (String) e)
                .sorted(Comparator.comparing(String::length))
                .collect(Collectors.toList());
    }
}
