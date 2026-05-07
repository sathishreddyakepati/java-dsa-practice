package conditionalLoops3;
import  java.util.Scanner;
//14. Volume Of Cone Java Program
public class ConeVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of cone: ");
        int r = in.nextInt();
        System.out.print("Enter height of cone: ");
        int h = in.nextInt();
        double volume = (1/3.0)*3.14*r*r*h;
        System.out.println("Volume of cone is "+volume+" m.cube .");

    }
}
