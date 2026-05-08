package conditionalLoops3;
import  java.util.Scanner;
//24.  Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumofDigits {

    static void sum(int[] array,int x){
        int sum = 0;
        for(int k=0;k<x;k++){
            sum = sum + array[k];

        }
        System.out.println("The sum of numbers is "+sum+" .");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ;
        arr = new int[100];
        int i;
        for(i=0;i<100;i++){
            System.out.print("Enter number: ");
            int a = in.nextInt();
            if(a==0){
                sum(arr,i);
                return;
            }
            arr[i] = a;
        }

    }
}
