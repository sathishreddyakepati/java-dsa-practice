package conditionalLoops3Intermediate;
import java.util.Scanner;
//15.Find Ncr & Npr
public class NcrAndNpr {
    public static int factorial(int x){
        if(x==0 || x==1){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = in.nextInt();
        System.out.print("Enter value of r: ");
        int r = in.nextInt();
        int npr = factorial(n)/factorial(n-r);
        int ncr = factorial(n)/(factorial(n-r)*factorial(r));
        System.out.println("NCR: "+ncr);
        System.out.println("NPR: "+npr);







    }
}
