import exercise04.PrintWithLambdaReferenceMethod;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrintWithLambdaRefMethod {

    private static final List<String> MONTHS = Arrays.asList(
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    );

    @Test
    void shouldPrintAllItemsUsingMethodReference() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        PrintWithLambdaReferenceMethod printerInstance = new PrintWithLambdaReferenceMethod();
        printerInstance.printWithReferenceMethod(MONTHS);

        System.setOut(System.out);

        String output = outContent.toString().trim();
        List<String> printedLines = Arrays.asList(output.split("\\r?\\n"));

        assertEquals(MONTHS.size(), printedLines.size());
        assertEquals(MONTHS, printedLines);
    }
}
