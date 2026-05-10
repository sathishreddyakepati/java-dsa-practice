package conditionalLoops3Intermediate;
import java.util.Scanner;
//2.Calculate Electricity Bill
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter units: ");
        int units = in.nextInt();
        double bill = units*2.45;
        System.out.println("Total amount: "+bill);

    }
}
