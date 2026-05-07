package conditionalLoops3;
import  java.util.Scanner;
//11. Perimeter Of Rectangle
public class RectanglePerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter Breadth of Rectangle: ");
        int b= in.nextInt();
        double peri = 2*(l+b);
        System.out.println("perimeter of Rectangle is "+peri+" m.");
    }
}
