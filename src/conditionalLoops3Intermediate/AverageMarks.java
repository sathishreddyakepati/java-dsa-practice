package conditionalLoops3Intermediate;
import java.util.Scanner;
//12.Calculate Average Marks
public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr=new int[6];
        int marks =0;
        for(int i=0;i<6;i++){
            System.out.print("Enter marks of sub "+i+" : ");
            arr[i] = in.nextInt();
            marks+=arr[i];
        }
        System.out.println("Average of marks is "+(marks/6)+" .");

    }
}
