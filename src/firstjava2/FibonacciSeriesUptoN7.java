package firstjava2;
import java.util.Scanner;
public class FibonacciSeriesUptoN7 {
    int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    void fibonacci(int n){
        int N = n;
        for(int i=0;i<N;i++){
            System.out.print(fibo(i)+" ,");
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter upto number of terms: ");
        int a = in.nextInt();
        FibonacciSeriesUptoN7 obj = new FibonacciSeriesUptoN7();
        obj.fibonacci(a);

    }
}
