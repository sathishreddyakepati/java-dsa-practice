package conditionalLoops3;
import java.util.Scanner;
//9. Perimeter Of Equilateral Triangle
public class EquiTrianglePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side length of Equilateral triangle: ");
        int a = in.nextInt();
        int peri = 3*a;
        System.out.println("perimeter of equilateral triangle is "+peri+" m.");

    }
}
