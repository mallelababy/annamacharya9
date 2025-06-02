import java.util.function.BiFunction;
public class LambdaCalculator {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        BiFunction<Double, Double, Double> divide = (a, b) -> b != 0 ? a / b : Double.NaN;
        double num1 = 10, num2 = 5;
        System.out.println("Addition: " + add.apply(num1, num2));
        System.out.println("Subtraction: " + subtract.apply(num1, num2));
        System.out.println("Multiplication: " + multiply.apply(num1, num2));
        System.out.println("Division: " + divide.apply(num1, num2));
    }
}
