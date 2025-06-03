import java.util.Scanner;
public class Add{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a first number:");
        int num1=s.nextInt();
        System.out.println("enter a second number:");
        int num2=s.nextInt();
        System.out.println("enter a third number:");
        int num3=s.nextInt();
        int  sum=num1+num2+num3;
        System.out.println("add is:"+ sum);
        s.close();
    }
}
