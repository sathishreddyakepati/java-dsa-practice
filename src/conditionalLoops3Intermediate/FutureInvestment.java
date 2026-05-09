package conditionalLoops3Intermediate;
import java.util.Scanner;
//18.Future Investment Value
public class FutureInvestment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount: ");
        double amount = in.nextDouble();
        System.out.print("Enter duration in year/s: ");
        int y = in.nextInt();
        System.out.println("Enter rate of interest: ");
        double rate= in.nextDouble();

        double FV = amount*(Math.pow((1+rate),y)-1)/rate;
        System.out.println("Future invest amount is "+FV+" $.");

    }
}
