package conditionalLoops3Intermediate;
import java.util.Scanner;
//9.Calculate Batting Average
public class BattingAvg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        for(int i =0;i<6;i++){
            System.out.print("Enter Ball "+(i+1)+" runs: ");
            int r = in.nextInt();
            sum+=r;
        }
        System.out.println("Batting average: "+(sum)/6.0);

    }
}
