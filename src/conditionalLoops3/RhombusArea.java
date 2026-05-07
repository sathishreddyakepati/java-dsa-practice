package conditionalLoops3;
import java.util.Scanner;
//6. Area Of Rhombus
public class RhombusArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter d1 length: ");
        int d1 = in.nextInt();
        System.out.println("Enter d2 length: ");
        int d2 = in.nextInt();
        double area = 0.5*d1*d2;
        System.out.println("Area of Rhombus is "+area+" m.sq .");


    }
}
