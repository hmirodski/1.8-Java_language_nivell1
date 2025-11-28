import exercise02.FilterByLetterOAndMoreThan5;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterByOLengthGreaterThan5Test {

    @Test
    void shouldFilterWordsWithOAndLengthGreaterThan5() {
        List<String> input = Arrays.asList(
                "house",
                "octopus",
                "hello",
                "Barcelona",
                "world",
                "dictionary"
        );

        List<String> filtered = FilterByLetterOAndMoreThan5.filter(input);

        assertEquals(Arrays.asList("octopus", "Barcelona", "dictionary"), filtered);
    }

}
