import exercise07.SortingMoreToLess;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingMoreToLessTest {
    @Test
    void shouldSortStringsFromLongToShort() {
        List<Object> mixedList = Arrays.asList(
                "one",
                123,
                "hi",
                "alphabet",
                999,
                "cat"
        );

        List<String> sorted = SortingMoreToLess.sortLongToShort(mixedList);

        assertEquals(Arrays.asList("alphabet", "one", "cat", "hi"), sorted);
    }
}
