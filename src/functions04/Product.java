package functions04;
import java.util.Scanner;
//5.Define a method that returns the product of two numbers entered by user.
public class Product {
    static double productof(int a,int b){
        double product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = in.nextInt();
        double pro = productof(n1,n2);
        System.out.println("Product is "+pro+" .");

    }
}
