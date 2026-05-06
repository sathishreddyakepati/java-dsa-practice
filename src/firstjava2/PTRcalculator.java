package firstjava2;
import java.util.Scanner;
//3.Take name as input and print a greeting message for that particular name.
public class PTRcalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter principal amount: ");
        double p = sc.nextDouble();
        System.out.printf("Enter Time: ");
        double t = sc.nextDouble();
        System.out.printf("Enter rate of interest: ");
        double r = sc.nextDouble();
        double si = p*t*r/100;
        System.out.printf("Simple Interest: "+si);
    }
}
