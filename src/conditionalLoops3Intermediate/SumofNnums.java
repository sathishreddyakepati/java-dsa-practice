package conditionalLoops3Intermediate;
import java.util.Scanner;
//13.Sum Of N Numbers
public class SumofNnums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no.of numbers: ");
        int n = in.nextInt();
        int[] arr= new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            System.out.print("Enter number: ");
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of numbers is "+sum);

    }
}
