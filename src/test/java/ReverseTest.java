import exercise08.ReverserInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTest {
    @Test
    void shouldReverseStringCorrectly() {
        ReverserInt reverser = (s) -> new StringBuilder(s).reverse().toString();

        String input = "Hello World";
        String expected = "dlroW olleH";

        assertEquals(expected, reverser.reverse(input));
    }
}
