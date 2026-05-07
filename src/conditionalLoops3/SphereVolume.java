package conditionalLoops3;
import  java.util.Scanner;
//17. Volume Of Sphere
public class SphereVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        int r = in.nextInt();
        double vol = (4/3.0)*3.14*r*r;
        System.out.println("Volume of sphere is "+vol+" m.cube .");
    }
}
