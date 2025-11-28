import exercise03.PrintWithLambda;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintWithLambdaTest {

    private static final List<String> MONTHS = Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    );

    @Test
    void printWithLambdaTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintWithLambda.printsWithLambda(MONTHS);

        System.setOut(System.out);

        String output = outContent.toString();

        assertEquals(12, output.split("\\r?\\n").length);
        assertTrue(output.contains("December"));
    }
}
