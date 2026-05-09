package conditionalLoops3Intermediate;
import java.util.Scanner;
//19.
public class HCF {
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
        System.out.println("HCF of "+k+" and "+l+" is "+hcf);

    }
}
