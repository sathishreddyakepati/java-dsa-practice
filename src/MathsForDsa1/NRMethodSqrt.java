package MathsForDsa1;
//Newton Raphson method
//root = (x+(N/x))/2 -->sqrt(N)
// x = assumed square root
//error = | root - x|
//1. assign x to N itself
//2. you will find your ans when error < 1
//3. update the  of x = root
// Complexity => O((log N)(f(n)))
public class NRMethodSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(40));

    }
    static double sqrt(double n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x +(n/x));

            if(Math.abs(root - x)<1){
                break;
            }
            x = root;
        }
        return root;
    }
}
