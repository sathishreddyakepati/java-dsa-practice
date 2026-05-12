package functions04;

import java.util.Scanner;

//10.Write a function to find if a number is a palindrome or not. Take number as parameter.
public class Palindrome {
    static void isPalindrome(String s){
        int n = s.length();
        for(int i =0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                System.out.println(s+" is not a Palindrome!");
                return;
            }
        }
        System.out.println(s+" is a palindrome!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.nextLine();
        isPalindrome(s);

    }
}
