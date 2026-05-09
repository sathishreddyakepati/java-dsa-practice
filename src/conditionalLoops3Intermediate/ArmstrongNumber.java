package conditionalLoops3Intermediate;
import firstjava2.ArmstrongNumber9;

import java.util.Scanner;
//14.
public class ArmstrongNumber {
    public static void CheckArmstrong(int n){
        int[] arr =new int[100];
        int x = n;
        int i  =0;
        while(x>0){
            int d = x%10;
            arr[i] = d;
            i++;
            x = (x-x%10)/10;
        }
        double sum =0;
        for(int j =0;j<i;j++){
            int y = arr[j];
            sum = sum + Math.pow(y,i);
        }
        if(n==sum){
            System.out.println(n+" is a Armstrong Number");
        }
        else{
            System.out.println(n+" is not a Armstrong Number");

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n1 = in.nextInt();
        CheckArmstrong(n1);



    }
}
