package functions04;
import java.util.Scanner;
//7. Define a method to find out if a number is prime or not.
public class Prime {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<n){
            if(n % c == 0){
                return false;
            }
            c++;
        }
        if(c*c>n){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        boolean result = isPrime(a);
        if(result){
            System.out.println(a+" is a prime number.");
        }
        else{
            System.out.println(a+" is not a prime number.");
        }

    }
}
