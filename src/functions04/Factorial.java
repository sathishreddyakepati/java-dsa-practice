package functions04;
import java.util.Scanner;
//9.Write a program to print the factorial of a number by defining
// a method named 'Factorial'.
public class Factorial {
    static int Factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*Factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        double result = Factorial(n);
        System.out.println(n+"! = "+result);

    }
}
