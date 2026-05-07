package conditionalLoops3;
import java.util.Scanner;
//1. Area Of Circle Java Program
public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        int r = sc.nextInt();
        int area = r*r;
        System.out.println("The area of Circle with radius "+r+" is "+area+" m.sq .");

    }
}
