package functions04;
import java.util.Scanner;
//4.Write a program to print the sum of two numbers entered by user
// by defining your own method.
public class Sum {
    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x= in.nextInt();
        System.out.print("Enter number 2: ");
        int y= in.nextInt();
        int sum = sum(x,y);
        System.out.println("Sum is "+sum+" .");

    }
}
