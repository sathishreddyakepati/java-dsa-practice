package conditionalLoops3;
import java.util.Scanner;
//3. Area Of Rectangle Program
public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        int l = in.nextInt();
        System.out.print("Enter Breadth of Rectangle: ");
        int b= in.nextInt();
        double area = l*b;
        System.out.println("The area of Rectangle with parameters "+l+", "+b+" is "+area+" m.sq .");
    }
}
