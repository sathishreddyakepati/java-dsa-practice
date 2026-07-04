package Lectures.StringsinJava;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        isPalin(s);

    }
    static void isPalin(String s){
        if(s.length() ==0 || s == null){
            System.out.println(s+ " is  a Palindrome.");
            return;
        }
        int st = 0;
        int end = s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                System.out.println(s+ " is not a Palindrome.");
                return;
            }
            st+=1;
            end-=1;
        }
        System.out.println(s+ " is  a Palindrome.");
    }
}
