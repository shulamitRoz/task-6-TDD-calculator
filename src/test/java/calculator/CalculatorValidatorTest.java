package calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorValidatorTest {

    @Test
    void shouldRemoveSpaces() {
        CalculatorValidator validator = new CalculatorValidator();

        String input = "1 + 2 + 3";
        String result = validator.cleanAndValidate(input);

        assertEquals("1+2+3", result);
    }

    @Test
    void shouldThrowExceptionOnDivisionByZero() {
        CalculatorValidator validator = new CalculatorValidator();

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            validator.cleanAndValidate("5 / 0");
        });

        assertEquals("Division by zero", exception.getMessage());
    }
}
