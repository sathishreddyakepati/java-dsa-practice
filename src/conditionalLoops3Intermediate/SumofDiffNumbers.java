package conditionalLoops3Intermediate;
import java.util.Scanner;
//26.Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers
// from a list of numbers (N) entered by the user. The list terminates when
// the user enters a zero.
public class SumofDiffNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];
        int x = -1;
        int SumNeg = 0;
        int SumPosEven = 0;
        int SumPosOdd = 0;
        while(x!=0){
            System.out.print("Enter Number: ");
            int n = in.nextInt();
            if(n>0 && n%2==0){
                SumPosEven+=n;
            }
            else if(n>0 && n%2!=0){
                SumPosOdd+=n;
            }
            else if(n<0){
                SumNeg+=n;
            }
            else if(n==0){
                x=0;
            }

        }
        System.out.println("Sum of negative numbers: "+SumNeg);
        System.out.println("Sum of positive even numbers: "+SumPosEven);
        System.out.println("Sum of positive odd numbers: "+SumPosOdd);

    }
}
