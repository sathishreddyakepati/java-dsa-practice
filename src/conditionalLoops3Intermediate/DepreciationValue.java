package conditionalLoops3Intermediate;
import java.util.Scanner;
//8.Calculate Depreciation of Value
public class DepreciationValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter purchase price: ");
        double p = in.nextDouble();
        System.out.print("Enter Salvage: ");
        double s =in.nextDouble();
        System.out.print("Enter no.of years: ");
        int y = in.nextInt();
        double d = (p-s)/y;
        System.out.println("Depreciation value: "+d);




    }
}
