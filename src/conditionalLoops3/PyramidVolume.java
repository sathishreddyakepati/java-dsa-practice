package conditionalLoops3;
import  java.util.Scanner;
//18. Volume Of Pyramid
public class PyramidVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area of pyramid: ");
        double area = in.nextDouble();
        System.out.print("Enter height of pyramid: ");
        int h = in.nextInt();
        double vol = (1/3.0)*area*h;
        System.out.println("Volume of Pyramid is "+vol+" m.cube .");

    }
}
