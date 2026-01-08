package calculator;

import java.util.Stack;

public class CalculatorCore {

    public double compute(String expression) {

        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < expression.length()) {
            char c = expression.charAt(i);

            // מספר (כולל מספר שלילי)
            if (Character.isDigit(c) || c == '.' ||
               (c == '-' && (i == 0 || isOperator(expression.charAt(i - 1))))) {

                StringBuilder sb = new StringBuilder();

                // אם זה מינוס של מספר – נוסיף אותו
                if (c == '-') {
                    sb.append(c);
                    i++;
                }

                while (i < expression.length() &&
                      (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i));
                    i++;
                }

                numbers.push(Double.parseDouble(sb.toString()));
                continue;
            }

            if (isOperator(c)) {
                while (!operators.isEmpty() &&
                        precedence(operators.peek()) >= precedence(c)) {

                    char op = operators.pop();
                    double b = numbers.pop();
                    double a = numbers.pop();
                    numbers.push(applyOp(a, b, op));
                }
                operators.push(c);
            }

            i++;
        }

        while (!operators.isEmpty()) {
            char op = operators.pop();
            double b = numbers.pop();
            double a = numbers.pop();
            numbers.push(applyOp(a, b, op));
        }

        return numbers.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence(char op) {
        if (op == '*' || op == '/') return 2;
        if (op == '+' || op == '-') return 1;
        return 0;
    }

    private double applyOp(double a, double b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        throw new UnsupportedOperationException("Unknown operator: " + op);
    }
}
