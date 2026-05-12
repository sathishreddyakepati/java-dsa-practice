package functions04;

import java.util.Scanner;

//13.all prime numbers between two numbers
public class PrimeNumbersBetween {
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
        System.out.print("Enter the number1: ");
        int n1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = in.nextInt();
        System.out.println("---Prime Numbers---");
        for(int i=n1+1;i<n2;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }

    }
}
