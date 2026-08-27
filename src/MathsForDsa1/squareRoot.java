package MathsForDsa1;

public class squareRoot {
    public static void main(String[] args) {
        int n = 46;
//        int ans = squareRoot(n);
//        if(ans!=-1){
//            System.out.println("Square root of "+n+" is "+ans+" .");
//        }
//        else{
//            System.out.println("Does not exist/Not a perfect square");
//        }
        System.out.println(sqrtDecimal(n,3));

    }
    // returns ans only if its a perfect square
    public static int squareRoot(int n){
        int left = 0;
        int right = n;

        while(left<right){
            int mid = left+(right-left)/2;

            if(mid*mid == n){
                return mid;
            } else if (mid*mid<n) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    //also return sqrts with decimal value
    public static double sqrtDecimal(int n,int p){
        double root = 0.0;
        double incr = 0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }

        return root;

    }
}
