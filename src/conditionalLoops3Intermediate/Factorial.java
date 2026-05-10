package conditionalLoops3Intermediate;
import java.util.Scanner;
//1.Factorial Program In Java
public class Factorial {
    public static int factorial1(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial1(x-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        double result = factorial1(n);
        System.out.println(result);

    }
}
