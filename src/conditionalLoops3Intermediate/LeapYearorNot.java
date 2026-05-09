package conditionalLoops3Intermediate;
import java.util.Scanner;
//23.Check Leap Year Or Not
public class LeapYearorNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int n = in.nextInt();
        if((n%4 == 0 && n%100!=0)|| n%400 ==0){
            System.out.println(n+" is a leap year.");
        }
        else {
            System.out.println(n+" is NOT a leap year.");
        }

    }
}
