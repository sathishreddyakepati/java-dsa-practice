package conditionalLoops3Intermediate;
import java.util.Scanner;
//7.Power In Java
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter V: ");
        int v = in.nextInt();
        System.out.print("Enter I: ");
        int i = in.nextInt();
        int p = v*i;
        System.out.println("Power = "+p+" W.");


    }
}
