package Lectures.StringsinJava;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+ 'c');
        System.out.println("a"+"c");
        System.out.println('d'+ 3 );
        System.out.println((char)('d'+ 3));

        System.out.println("a"+ 1);
        //this is same as after a few steps: "a" + "1"
        //integer will be coverted to Integer that will call toString()

        System.out.println("Sathish" +new ArrayList<>());
        System.out.println("Sathish" +new Integer(45));

        // in java + operator can only be used with primitives,otherwise
        // anyone one of operand should be string
        System.out.println(new Integer(99)+""+new ArrayList<>());

        //here '+' is overloaded(this is called operator overloading),as
        //'+' is used for adding two numbers
        //same '+' is used for joining two Strings(concat)


    }
}
