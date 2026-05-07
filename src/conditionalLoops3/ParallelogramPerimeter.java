package conditionalLoops3;
import java.util.Scanner;
//10. Perimeter Of Parallelogram
public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length a: ");
        int a = in.nextInt();
        System.out.print("Enter length b: ");
        int b = in.nextInt();
        int peri = 2*(a+b);
        System.out.println("perimeter of parallelogram is "+peri+" m.");

    }
}
