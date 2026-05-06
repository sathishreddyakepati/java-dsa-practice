package firstjava2;
//4.Take in two numbers and an operator(+,-,*,/) and calculate the value.(Use if conditions)
import java.util.Scanner;
public class TakeInputandCalculate4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter operator: ");
        char o = sc.next().charAt(0);
        if(o == '+'){
            int result = a+b;
            System.out.println("Result : "+ result);
        }
        else if(o == '-'){
            int result = a-b;
            System.out.println("Result : "+ result);
        }
        else if(o == '*'){
            int result = a*b;
            System.out.println("Result : "+result);
        }
        else if(o == '/'){
            int result = a/b;
            System.out.println("Result : "+result);
        }
        else {
            System.out.println("Invalid Operator!");
        }


    }



}
