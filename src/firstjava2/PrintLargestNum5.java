package firstjava2;
import java.util.Scanner;

public class PrintLargestNum5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number 2: ");
        int b = sc.nextInt();

        int max = (a>b)? a:b;

        System.out.printf("Max number is "+max+".");



    }
}
