package conditionalLoops3Intermediate;
import java.util.Scanner;
//21.
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        String s = in.nextLine();
        char c = s.charAt(0);

        if(c == 'A'|| c =='E' || c=='I' || c=='O' || c=='U'||c == 'a'|| c =='e' || c=='i' || c=='o' || c=='u' ){
            System.out.println(c+" is a Vowel.");
        }
        else{
            System.out.println(c+" is a Consonant.");
        }


    }
}
