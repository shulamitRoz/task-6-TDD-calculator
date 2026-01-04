package calculator;

public class Calculator {

    private CalculatorValidator validator = new CalculatorValidator();
    private CalculatorCore core = new CalculatorCore();

    public double calculate(String expression) {
        String cleanExpr = validator.cleanAndValidate(expression);
        return core.compute(cleanExpr);
    }
}
