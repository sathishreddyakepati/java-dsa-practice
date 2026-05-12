package Lectures;

import java.util.Scanner;

public class Methods {
    //method used to sum two numbers
    static  void  sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("Sum is "+sum);
    }
    /*return_type name(){
        //body
        return  statement;
    }
     */
    //if you specific any return type to a function,
    // then function must return it otherwise,it throws an error
    // if a variable is initialised inside a block,then it can be accessed only inside that block.
    //if a variable is initialised out size the block,then its value can be changed(updated) inside the block(but cannot be reinitialised)


    public static void main(String[] args) {
        sum();

    }
}
