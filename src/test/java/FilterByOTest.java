import exercise01.FilterByLetterO;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterByOTest {

    @Test
    void shouldReturnCorrectList() {
        List<String> expected = Arrays.asList("apple", "google", "microsoft");
        FilterByLetterO filterer = new FilterByLetterO();
        List<String> actual = filterer.filter(expected);

        assertEquals(expected.size(), actual.size());

        assertEquals(expected.size(), actual.size());
        assertTrue(actual.containsAll(expected) && expected.containsAll(actual));
    }
}
