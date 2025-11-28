public class ReverseTest {
    @Test
    void shouldReverseStringCorrectly() {
        ReverserInt reverser = (s) -> new StringBuilder(s).reverse().toString();

        String input = "Hello World";
        String expected = "dlroW olleH";

        assertEquals(expected, reverser.reverse(input));
    }
}
