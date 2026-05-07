package conditionalLoops3;
import  java.util.Scanner;
//15. Volume Of Prism
public class PrismVolume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area of Prism: ");
        int b = in.nextInt();
        System.out.print("Enter height length of Prism: ");
        int h = in.nextInt();
        double vol = b*h;
        System.out.println("Volume of prism is "+vol+" m.cube .");

    }
}
