package conditionalLoops3;
import java.util.Scanner;
//2. Area Of Triangle
public class TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base length of triangle: ");
        int b = in.nextInt();
        System.out.print("Enter height length of triangle: ");
        int h = in.nextInt();
        double area = 0.5*b*h;
        System.out.println("The area of triangle with parameters "+b+", "+ h +" is "+area+" m.sq .");

    }
}
