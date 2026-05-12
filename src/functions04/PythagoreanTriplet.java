package functions04;

import java.util.Scanner;

//12.Write a function to check if a given triplet is a
// Pythagorean triplet or not. (A Pythagorean triplet is
// when the sum of the square of two numbers is equal to the square
// of the third number).
public class PythagoreanTriplet {
    static void  isPythagorean(int x,int y,int z){
        if((x*x==y*y+z*z)||(y*y==x*x+z*z)||(z*z==y*y+x*x) ){
            System.out.println(x+", "+y+", "+z+" is a pythagorean triplet.");
        }
        else {
            System.out.println(x + ", " + y + ", " + z + " is not a pythagorean triplet.");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a =in.nextInt();
        System.out.print("Enter b: ");
        int b =in.nextInt();
        System.out.print("Enter c: ");
        int c =in.nextInt();
        isPythagorean(a,b,c);

    }
}
