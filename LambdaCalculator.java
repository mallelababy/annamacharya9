import java.util.function.BiFunction;
public class MultipleOperationsCalculator {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> addition = (a, b) -> a + b;
        BiFunction<Double, Double, Double> subtraction = (a, b) -> a - b;
        BiFunction<Double, Double, Double> multiplication = (a, b) -> a * b;
        BiFunction<Double, Double, Double> division = (a, b) -> b != 0 ? a / b : Double.NaN;
        System.out.println("Addition: " + addition.apply(10.0, 5.0));
        System.out.println("Subtraction: " + subtraction.apply(10.0, 5.0));
        System.out.println("Multiplication: " + multiplication.apply(10.0, 5.0));
        System.out.println("Division: " + division.apply(10.0, 5.0));
    }
}
