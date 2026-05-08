package conditionalLoops3;
import  java.util.Scanner;
//22. Subtract the Product and Sum of Digits of an Integer
public class DigitsProductSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        double n = in.nextDouble();
        double[] arr = new double[100];
        double x = n;
        int i = 0;
        while(x>0){
            double d = x%10;
            arr[i] = d;
            i++;
            x = (x-d)/10.0;
        }
        double product = 1;
        double sum = 0;
        for(int k=0;k<i;k++){
            sum = sum + arr[k];
            product = product*arr[k];
        }
        System.out.println("Sum of digits: "+sum+" .");
        System.out.println("Product of digits: "+product+" .");
        double result = product - sum;
        System.out.println("Product - Sum = "+result+" .");

    }
}
