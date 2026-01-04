package calculator;

public class CalculatorValidator {

    public String cleanAndValidate(String expression) {
        if (expression == null || expression.isEmpty()) {
            throw new IllegalArgumentException("Empty expression");
        }

        // הסרת רווחים
        String cleaned = expression.replaceAll("\\s+", "");

        if (cleaned.contains("/0")) {
            throw new ArithmeticException("Division by zero");
        }

        return cleaned;
    }
}
