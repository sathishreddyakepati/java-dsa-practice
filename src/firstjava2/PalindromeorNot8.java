package firstjava2;
import java.util.Scanner;
public class PalindromeorNot8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = in.nextLine();
        int n = s.length();
        for(int i =0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                System.out.println(s+" is not a Palindrome!");
                return;
            }
        }
        System.out.println(s+" is a palindrome!");
    }


}
