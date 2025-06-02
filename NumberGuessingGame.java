import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        while (userGuess != numberToGuess) {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = scanner.nextInt();
            if (userGuess < numberToGuess) {
                System.out.println("Higher!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Lower!");
            } else {
                System.out.println("Congratulations! You guessed it!");
            }
        }
    }
}
