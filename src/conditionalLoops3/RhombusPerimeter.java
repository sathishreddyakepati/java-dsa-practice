package conditionalLoops3;
import java.util.Scanner;
//13. Perimeter Of Rhombus
public class RhombusPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of side: ");
        int a = in.nextInt();
        int peri = 4*a;
        System.out.println("Perimeter of Rhombus is "+peri+" m.");

    }
}
