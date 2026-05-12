package functions04;
import java.util.Scanner;
//1.Define two methods to print the maximum and the minimum number
// respectively among three numbers entered by the user.
public class MaxAndMinNums {
    static void max(int a,int b,int c){
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max) {
            max = c;
        }
        System.out.println("The maximum number is "+max+" .");
    }
    static void min(int a,int b,int c){
        int min = a;
        if(b<min){
            min = b;
        }
        if(c<min) {
            min = c;
        }
        System.out.println("The minimum number is "+min+" .");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = in.nextInt();
        System.out.print("Enter number 3: ");
        int n3 = in.nextInt();
        max(n1,n2,n3);
        min(n1,n2,n3);
    }
}
