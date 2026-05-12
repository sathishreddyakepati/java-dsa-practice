package functions04;
import java.util.Scanner;
//A person is eligible to vote if his/her age is greater than or
// equal to 18. Define a method to find out if he/she is eligible to vote.
public class VoteEligibility {
    static void checkEligibility(int age){
        if (age >= 18) {
            System.out.print("You are eligible to Vote!");
        }
        System.out.print("You are not eligible to Vote!");


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = in.nextInt();
        checkEligibility(a);

    }
}
