package Lectures.LectureQuestions;
//print all 3 digit Armstrong Numbers
public class ThreeDigitArmstrongNums {
    static int isArmstrong(int n){
        double sum = 0;
        double x = n;
        while(x>0){
            double d = x%10;
            sum = sum + Math.pow(d,3);
            x = (x-d)/10.0;
        }
        if(sum!=n){
            return -1;
        }
        return n;
    }
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            int x = isArmstrong(i);
            if(x!= -1){
                System.out.print(x+" ");
            }

        }

    }
}
