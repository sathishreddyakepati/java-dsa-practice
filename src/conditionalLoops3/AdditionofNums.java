package conditionalLoops3;
import java.util.Scanner;
//26. Addition Of Two Numbers
public class AdditionofNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+sum+" .");
    }
}
