package firstjava2;
import java.util.Scanner;

public class RupeetoUSD6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Amount in Rupees: ");
        double amount = in.nextDouble();
        System.out.println(amount+" Rupees = "+amount*81+" USD.");

    }
}
