package MathsForDSA;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 12;//note: fix for n = 0
        if(n==0){
            System.out.println("false");
            return;
        }
        else{
            boolean ans = (n & (n-1)) ==0 ;
            System.out.println(ans);
        }

    }
}
