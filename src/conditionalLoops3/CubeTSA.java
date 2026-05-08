package conditionalLoops3;
import  java.util.Scanner;
//20. Total Surface Area Of Cube
public class CubeTSA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter edge length of cube: ");
        int a = in.nextInt();
        int tsa = 6*a*a;
        System.out.println("TSA of Cube is "+tsa+" m.sq .");

    }
}
