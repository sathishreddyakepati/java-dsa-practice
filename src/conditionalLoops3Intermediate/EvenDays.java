package conditionalLoops3Intermediate;
import java.util.Scanner;
//25.Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.
public class EvenDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int even = 0;
        for(int i=1;i<32;i++){
            if(i%2==0){
                even+=1;
            }
        }
        System.out.print("No of even days: "+even);

    }
}
