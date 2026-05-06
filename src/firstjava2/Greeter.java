package firstjava2;
import java.util.Scanner;
//2.Take name as input and print a greeting message for that particular name.
public class Greeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String s= sc.nextLine();
        System.out.println(s+", thanks for coming!");
    }
}
