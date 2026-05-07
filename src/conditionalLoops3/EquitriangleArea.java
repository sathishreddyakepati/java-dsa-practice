package conditionalLoops3;
import java.util.Scanner;
//7. Area Of Equilateral Triangle
public class EquitriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side length of triangle: ");
        int a = in.nextInt();
        double area = (Math.sqrt(3)/4)*a*a;
        System.out.println("Area of Equilateral Triangle is "+area+" m.sq .");
    }
}
