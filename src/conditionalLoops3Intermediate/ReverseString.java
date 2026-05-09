package conditionalLoops3Intermediate;
import java.util.Scanner;

//16.Reverse A String In Java
public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = in.nextLine();
        char[] arr= s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n/2;i++){
            char temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        String ns = new String(arr);
        System.out.println("Reversed String: "+ns);

    }
}
