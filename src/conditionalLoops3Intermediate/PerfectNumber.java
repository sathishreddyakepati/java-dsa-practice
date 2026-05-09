package conditionalLoops3Intermediate;
import java.util.Scanner;
//22.Perfect Number In Java
public class PerfectNumber {
    public static boolean isPerfect(int num){
        if(num<=1) return false;
        int sum = 0;
        for(int i =1;i<=num/2;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum==num;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if(isPerfect(num)){
            System.out.println(num+" is a perfect number.");

        }
        else{
            System.out.println(num+" is not a perfect number.");
        }

    }
}
