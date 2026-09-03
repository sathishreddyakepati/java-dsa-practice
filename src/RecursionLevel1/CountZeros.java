package RecursionLevel1;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZerosRec(1090007));

    }
//    static int countZeros(int n){
//        int count = 0;
//        while(n>0){
//            int d = n%10;
//            if(d==0){
//                count++;
//            }
//
//            n = n/10;
//        }
//        return count;
//    }
    static int countZerosRec(int n){
        return helper(n, 0);
    }
    private static int helper(int n, int c){
        if(n==0){
            return c;
        }
        int rem = n % 10;
        if(rem ==0){
            return helper(n/10, c+1);
        }
        return helper(n/10,c);

    }
}
