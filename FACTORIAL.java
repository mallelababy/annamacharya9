import  java.util.Scanner;
public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=s.nextInt();
         System.out.println( factorial(n));
    }
}
