package exercise01;

import java.util.List;
import java.util.stream.Collectors;

public class FilterByLetterO {

    public static List<String> filter(List<String>list){
        return list.stream()
                .filter(w -> w.contains("o"))
                .collect(Collectors.toList());
    }
}
