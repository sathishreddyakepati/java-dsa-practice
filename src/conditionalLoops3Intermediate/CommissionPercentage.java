package conditionalLoops3Intermediate;
import java.util.Scanner;
//6.Calculate Commission Percentage
public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount: ");
        double amount = in.nextDouble();
        double perct = 12.3;
        if(amount >= 10000 && amount<15000){
            perct = 15;
        }
        else if(amount >= 15000 && amount<20000){
            perct = 20;
        }
        else if(amount > 20000){
            perct = 25;
        }
        System.out.println("Commission percentage: "+perct);

    }
}
