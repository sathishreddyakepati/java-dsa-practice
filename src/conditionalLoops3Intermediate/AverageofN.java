package conditionalLoops3Intermediate;
import java.util.Scanner;
//3.Calculate Average Of N Numbers
public class AverageofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of numbers: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter number: ");
            int x = in.nextInt();
            sum+=x;
        }
        System.out.println("Average: "+sum/n);

    }
}
