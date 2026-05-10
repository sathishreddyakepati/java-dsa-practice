package conditionalLoops3Intermediate;
import java.util.Scanner;
//10.Calculate CGPA Java Program
public class CGPACalculate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for(int i=0;i<6;i++){
            System.out.print("Enter sub "+(i+1)+" marks out of 100: ");
            int x = in.nextInt();
            sum+=x;
        }
        System.out.println("CGPA: "+(sum/600.0)*10);

    }
}
