# Calculator Project

This project is a simple calculator implemented in Java.  
It supports addition, subtraction, multiplication, and division of decimal and negative numbers.

## Project Structure

- `CalculatorValidator.java` – validates and cleans input expressions.
- `CalculatorCore.java` – computes the result of expressions.
- `Calculator.java` – integrates the validator and core to provide a single calculate method.
- `CalculatorCoreTest.java` – unit tests for computation logic.
- `CalculatorTest.java` – integration tests for validator + core.
- `CalculatorValidatorTest.java` – unit tests for input validation.

## Running Tests

This project uses Maven and JUnit for testing.  
To run all tests, execute:

```bash
mvn test
