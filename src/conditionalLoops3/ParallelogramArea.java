package conditionalLoops3;
import java.util.Scanner;
//5. Area Of Parallelogram
public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base length of parallelogram: ");
        int b = in.nextInt();
        System.out.print("Enter height length of parallelogram: ");
        int h = in.nextInt();
        double area = b*h;
        System.out.println("The area of parallelogram with parameters "+b+", "+ h +" is "+area+" m.sq .");

    }

}
