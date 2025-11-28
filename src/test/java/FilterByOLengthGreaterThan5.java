import exercise02.FilterByLetterOAndMoreThan5;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterByOLengthGreaterThan5 {
    @Test
    void shouldFilterByOAndLengthGreaterThan5() {
        List<String> words = Arrays.asList(
                "car", "motorcycle", "computer", "operation", "dog", "language"
        );
        List<String> expected = Arrays.asList("motorcycle", "computer", "operation", "language");
        List<String> actual = FilterByLetterOAndMoreThan5.filter(words);

        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }
}
