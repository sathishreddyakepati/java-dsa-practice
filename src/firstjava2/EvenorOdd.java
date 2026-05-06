package firstjava2;
import java.util.Scanner;
//1.Write a program to print whether a number is even or odd, also take input from the user.
public class EvenorOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println(x+" is a even number.");
        }
        else{
            System.out.println(x+" is a odd number.");
        }

    }
}
