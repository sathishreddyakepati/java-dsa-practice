package conditionalLoops3;
import  java.util.Scanner;
//19. Curved Surface Area Of Cylinder
public class CylinderCSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter height of cylinder: ");
        int h = in.nextInt();
        System.out.print("Enter radius of Cylinder: ");
        int r = in.nextInt();
        double csa = 2*3.14*r*h;
        System.out.println("CSA of Cylinder is "+csa+" m.sq .");

    }
}
