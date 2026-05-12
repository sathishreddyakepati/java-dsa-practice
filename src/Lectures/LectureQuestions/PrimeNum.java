package Lectures.LectureQuestions;

import java.util.Scanner;

public class PrimeNum {
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
        System.out.println(result);

    }
}
