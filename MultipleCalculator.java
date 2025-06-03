import java.util.Scanner;
public class MultiVariableCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter an expression (e.g., 3 + 5 * 2): ");
            String expression = scanner.nextLine();
            double result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");
        String[] tokens = expression.split("(?=[-+*/])|(?<=[-+*/])");
        double result = 0;
        double currentNumber = 0;
        char currentOperator = '+';
        for (String token : tokens) {
            if (token.matches("[0-9]+")) { 
                currentNumber = Double.parseDouble(token);
            } else if (token.matches("[+\\-*/]")) { 
                result = applyOperator(result, currentNumber, currentOperator);
                currentOperator = token.charAt(0);
            } else {
                throw new IllegalArgumentException("Invalid token: " + token);
            }
        }
        result = applyOperator(result, currentNumber, currentOperator);

        return result;
    }
    private static double applyOperator(double result, double currentNumber, char operator) {
        switch (operator) {
            case '+':
                return result + currentNumber;
            case '-':
                return result - currentNumber;
            case '*':
                return result * currentNumber;
            case '/':
                if (currentNumber == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return result / currentNumber;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
