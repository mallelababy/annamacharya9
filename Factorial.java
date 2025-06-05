import java.util.Scanner;
class Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        long factorial=1;
        for(int i=2;i<=n;i++){
            factorial*=i;
            System.out.println(factorial);
        }
        sc.close();
    }
}
