package functions04;

import java.util.Scanner;

//14.Write a function that returns the sum of first n natural numbers.
public class SumofFirstNnaturalNumns {
    static  void sumUptoN(int n){
        int sum = n*(n+1)/2;
        System.out.println("Sum of natural numbers upto "+n+" is "+sum+" .");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num  = in.nextInt();
        sumUptoN(num);
    }
}
