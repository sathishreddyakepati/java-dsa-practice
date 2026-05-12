package functions04;
import  java.util.Scanner;
//6.Write a program to print the circumference and area of a circle of radius
// entered by user by defining your own method.
public class CircumferenceAndAreaofCircle {
    static void FindCandA(double r){
        double c = 2*3.14*r;
        double a = 3.14*r*r;
        System.out.println("Area of Circle is "+a+" m.sq .");
        System.out.println("Circumference of Circle is "+c+" m .");

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double rad = in.nextDouble();
        FindCandA(rad);
    }
}
