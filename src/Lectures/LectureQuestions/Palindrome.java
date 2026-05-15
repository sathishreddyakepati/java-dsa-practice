package Lectures.LectureQuestions;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = in.next();
        s = s.toLowerCase();
        int end = s.length() - 1;
        int start = 0;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println(s+" is not a Palindrome.");
                return;
            }
            start+=1;
            end-=1;
        }
        System.out.println(s+" is a Palindrome!");



    }
}
