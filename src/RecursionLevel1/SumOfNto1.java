package RecursionLevel1;

public class SumOfNto1 {
    public static void main(String[] args) {
        System.out.println(sumN(10));

    }
    static  int sumN(int n){
        if(n==1){
            return 1;
        }
        return n+sumN(n-1);
    }
}
