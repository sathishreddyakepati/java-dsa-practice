package conditionalLoops3;
import  java.util.Scanner;
//25.  Take integer inputs till the user enters 0 and print the largest number from all.
public class LargestNumber {
    static void largest(int[] array,int x){
        for(int k=0;k<x;k++){
            for(int j=k+1;j<x;j++){
                if(array[k]<array[j]){
                    int t = array[j];
                    array[j] = array[k];
                    array[k] = t;
                }
            }
        }
        System.out.println("Largest number is "+array[0]+" .");
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
                largest(arr,i);
                return;
            }
            arr[i] = a;
        }

    }
}
