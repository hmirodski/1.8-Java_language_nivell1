import exercise01.FilterByLetterO;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterByOTest {

    @Test
    void shouldFilterWordsContainingLetterO() {
        List<String> input = Arrays.asList(
                "Hola",
                "Test",
                "octuber",
                "Java",
                "World",
                "hmm"
        );

        List<String> filtered = FilterByLetterO.filter(input);

        assertEquals(Arrays.asList("Hola", "octuber", "World"), filtered);
    }
}
