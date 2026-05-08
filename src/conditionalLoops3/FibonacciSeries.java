package conditionalLoops3;
import  java.util.Scanner;
//21.  Fibonacci Series In Java Programs
public class FibonacciSeries {
    static void fibonacci(int x){
        for(int i=0;i<x;i++){
            System.out.print(fibo(i)+" ");
        }
    }
    static int fibo(int x){
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        return fibo(x-1)+fibo(x-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no of terms: ");
        int t = in.nextInt();
        fibonacci(t);

    }
}
