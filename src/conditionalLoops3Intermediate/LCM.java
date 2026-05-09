package conditionalLoops3Intermediate;
import java.util.Scanner;
//20.LCM Of Two Numbers
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = in.nextInt();
        System.out.print("Enter number 2: ");
        int b = in.nextInt();
        int k = a;
        int l = b;

        while(b!=0){
            int temp = b;
            b = b%a;
            a= temp;
        }
        int hcf = a;
        int lcm = (k*l)/hcf;
        System.out.println("LCM of "+k+" and "+l+" is "+lcm);


    }
}
