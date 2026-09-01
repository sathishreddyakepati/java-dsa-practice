package RecursionLevel1;

public class SumofDigits {
    public static void main(String[] args) {
        System.out.println(sumD(123));

    }
    static int sumD(int n){
        if(n==0){
            return 0;
        }
        int d = n%10;
        return d+sumD(n/10);
    }
}
