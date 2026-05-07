package conditionalLoops3;
import  java.util.Scanner;
//16. Volume Of Cylinder
public class CylinderVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        int r = in.nextInt();
        System.out.print("Enter height of cylinder: ");
        int h = in.nextInt();

        double vol = 3.14*r*r*h;
        System.out.println("Volume of cylinder is "+vol+" m.cube .");



    }
}
