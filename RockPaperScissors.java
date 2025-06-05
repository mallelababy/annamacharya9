import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        System.out.println("Enter Rock, Paper, or Scissors:");
        String userChoice = sc.nextLine();
        int computerChoiceIndex = rand.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];
        System.out.println("Computer chose: " + computerChoice);
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
        sc.close();
    }
}
