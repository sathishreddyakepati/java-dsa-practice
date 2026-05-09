package conditionalLoops3Intermediate;
import java.util.Scanner;
//11.Compound Interest Java Program
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal Amount: ");
        double p = in.nextDouble();
        System.out.print("Enter rate: ");
        double r = in.nextDouble();
        System.out.print("No.of times interest Compound per year: ");
        int n = in.nextInt();
        System.out.println("Enter time in years: ");
        int t = in.nextInt();

        double a = p*(Math.pow(1+(r/n),n*t));
        System.out.println("Total accumulated amount: "+a);


    }
}
