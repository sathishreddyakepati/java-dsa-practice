package firstjava2;
import java.util.Scanner;

public class ArmstrongNumber9{
    void CheckArmstrong(int n){
        int[] arr =new int[100];
        int x = n;
        int i  =0;
        while(x>0){
            int d = x%10;
            arr[i] = d;
            i++;
            x = (x-x%10)/10;
        }
        double sum =0;
        for(int j =0;j<i;j++){
            int y = arr[j];
            sum = sum + Math.pow(y,i);
        }
        if(n==sum){
            System.out.println(n+" is a Armstrong Number");;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int n1 = in.nextInt();
        System.out.print("Enter the number2: ");
        int n2 = in.nextInt();
        ArmstrongNumber9 obj = new ArmstrongNumber9();
        for(int k = n1;k<=n2;k++){
            obj.CheckArmstrong(k);
        }



    }

}
