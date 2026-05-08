package conditionalLoops3;
import  java.util.Scanner;
//23.  Input a number and print all the factors of that number (use loops).
public class NumberFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double n  = in.nextDouble();
        int[] arr = new int[100];
        int i = 1;
        arr[0] = 1;
        int x =2;
        while(x<=n){
            if(n%x == 0){
                arr[i] = x;
                i++;
            }
            x++;
        }
        System.out.println("---Factors of "+n+" ---");
        for (int k = 0;k<i;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
