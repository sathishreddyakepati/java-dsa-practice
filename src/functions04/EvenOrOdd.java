package functions04;
import java.util.Scanner;
//2.Define a program to find out whether a given number is even or odd.
public class EvenOrOdd {
    static void check(int n){
        if(n%2==0){
            System.out.println(n+" is a even number.");
        }
        System.out.println(n+" is a odd number.");

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = in.nextInt();
        check(x);
    }
}
