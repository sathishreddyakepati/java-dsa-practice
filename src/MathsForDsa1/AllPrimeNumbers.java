package MathsForDsa1;
// space complexity - O(n)
// Time Complexity = O(N * log(log N)) --(Harmonic progression form)
public class AllPrimeNumbers {
    public static void main(String[] args) {
        int N = 40;

//eliminate multiples of already checked numbers using boolean array
        boolean[] primes = new boolean[N+1];
        sieve(N, primes);
    }
    static void sieve(int n,boolean[] primes){
        for(int i=2;i*i<=n;i++){
            if(!primes[i]){
                 for(int j=i*2;j<=n;j+=i){
                     primes[j] = true;
                 }
            }
        }
        for(int i=2;i<=n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
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
