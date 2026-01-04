package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorCoreTest {

    @Test
    void shouldComputeSimpleAddition() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(3.0, core.compute("1+2"), 0.0001);
    }

    @Test
    void shouldComputeSimpleSubtraction() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(4.0, core.compute("6-2"), 0.0001);
    }

    @Test
    void shouldComputeSimpleMultiplication() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(12.0, core.compute("3*4"), 0.0001);
    }

    @Test
    void shouldComputeSimpleDivision() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(5.0, core.compute("10/2"), 0.0001);
    }

    @Test
    void shouldComputeMultipleOperators() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(7.0, core.compute("3+2*2"), 0.0001);
        assertEquals(2.0, core.compute("8/4-0"), 0.0001);
    }

    @Test
    void shouldComputeLongExpression() {
        CalculatorCore core = new CalculatorCore();
        assertEquals(36.0, core.compute("-2+3*12+2"), 0.0001);
    }

   
}

