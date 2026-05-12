package functions04;
import java.util.Scanner;
//8.Write a program that will ask the user to enter his/her marks
// (out of 100). Define a method that will display grades according to
// the marks entered as below:
public class Grade {
    static void checkGrade(double m){
        if(m<=40){
            System.out.println("Grade: Fail");
        }
        else if(m>=41 && m<=50){
            System.out.println("Grade: DD");
        }
        else if(m>=51 && m<=60){
            System.out.println("Grade: CD");
        }
        else if(m>=61 && m<=70){
            System.out.println("Grade: BC");
        }
        else if(m>=71 && m<=80){
            System.out.println("Grade: BB");
        }
        else if(m>=81 && m<=90){
            System.out.println("Grade: AB");
        }
        else if(m>=91 && m<=100){
            System.out.println("Grade: AA");
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks(out of 100): ");
        double marks = in.nextDouble();
        checkGrade(marks);
    }
}
