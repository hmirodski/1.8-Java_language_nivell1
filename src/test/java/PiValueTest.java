import exercise05.PiValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PiValueTest {
    @Test
    public void testPiValueWithMathConstant() {
        PiValue piValue = () -> Math.PI;

        assertEquals(Math.PI, piValue.getPiValue(), 0.0000001);
    }
}
