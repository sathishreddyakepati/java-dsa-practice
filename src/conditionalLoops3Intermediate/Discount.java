package conditionalLoops3Intermediate;
import java.util.Scanner;
//4.Calculate Discount Of Product
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amt = in.nextInt();
        double discount = amt*0.05;
        System.out.println("After discount amount: "+(amt-discount));

    }
}
