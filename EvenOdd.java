import java.util.Scanner;
class EvenOdd{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=s.nextInt();
        if(num % 2 == 0){
            System.out.println("it is an even number:");
        }
        else{
            System.out.println("it is an odd number:");
        }
        s.close();
    }
}
