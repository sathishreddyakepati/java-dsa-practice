package conditionalLoops3Intermediate;
import java.util.Scanner;
//5.
public class DistanceBWPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = in.nextInt();
        System.out.print("Enter y1: ");
        int y1 = in.nextInt();
        System.out.print("Enter x2: ");
        int x2 = in.nextInt();
        System.out.print("Enter y2: ");
        int y2 = in.nextInt();

        double dis = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("Distance between points: "+dis);


    }
}
