package conditionalLoops3Intermediate;
import java.util.Scanner;
//24.Sum Of A Digits Of Number
public class SumofDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int x = n;
        int sum = 0;
        while(x>0){
            int d = x%10;
            sum = sum + d;
            x = (x-d)/10;
        }
        System.out.println("Sum of digits: "+sum);

    }
}
