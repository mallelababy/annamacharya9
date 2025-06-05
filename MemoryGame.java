import java.util.Scanner;
public class MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cards = {"A", "B", "C", "A", "B", "C"};
        boolean[] revealed = new boolean[cards.length];
        int pairsFound = 0;
        while (pairsFound < cards.length / 2) {
            System.out.print("Pick first card (0-5): ");
            int first = sc.nextInt();
            System.out.print("Pick second card (0-5): ");
            int second = sc.nextInt();
            if (first == second || first < 0 || second < 0 || first >= cards.length || second >= cards.length) {
                System.out.println("Invalid picks. Try again.");
                continue;
            }
            if (cards[first].equals(cards[second])) {
                if (!revealed[first] && !revealed[second]) {
                    revealed[first] = true;
                    revealed[second] = true;
                    pairsFound++;
                    System.out.println("Match found!");
                } else {
                    System.out.println("Cards already matched.");
                }
            } else {
                System.out.println("No match.");
            }
        }

        System.out.println("You found all pairs! Game over.");
        sc.close();
    }
}
