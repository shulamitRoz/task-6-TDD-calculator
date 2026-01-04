package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void shouldComputeExpressionCorrectly() {
        Calculator calculator = new Calculator();

        String expression = " 1 + 2 ";
        double result = calculator.calculate(expression);

        assertEquals(3.0, result, 0.0001);
    }
}
