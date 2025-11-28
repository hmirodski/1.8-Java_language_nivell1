import exercise06.SortingLessToMoreChars;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingByLengthTest {
    @Test
    void shouldSortStringsFromShortToLong() {
        List<Object> mixedList = Arrays.asList(
                "one",
                123,
                "hi",
                "alphabet",
                999,
                "cat"
        );

        List<String> sorted = SortingLessToMoreChars.sortShortToLong(mixedList);

        assertEquals(Arrays.asList("hi", "one", "cat", "alphabet"), sorted);
    }
}
