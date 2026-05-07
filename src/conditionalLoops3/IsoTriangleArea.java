package conditionalLoops3;
import java.util.Scanner;
//4. Area Of Isosceles Triangle
public class IsoTriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base length of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter hypotenuse length of triangle: ");
        double a = in.nextInt();
        double area = Math.abs(0.5*b*Math.sqrt(a*a -(b*b)/4.0));
        System.out.println("The area of triangle with parameters "+b+", "+ a +" is "+area+" m.sq .");
    }
}
