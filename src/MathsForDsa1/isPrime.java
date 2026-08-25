package MathsForDsa1;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(1));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
        }
        return true;
    }
}
