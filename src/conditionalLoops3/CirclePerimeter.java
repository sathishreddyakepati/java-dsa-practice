package conditionalLoops3;
import java.util.Scanner;
//8. Perimeter Of Circle
public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = in.nextInt();
        double perimeter = 2*3.14*r;
        System.out.println("Perimeter of circle is "+perimeter+ " m.");
    }
}
