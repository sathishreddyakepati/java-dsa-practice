package Lectures.TimeAndSpaceComplexity;

public class fibo {
    public static void main(String[] args) {
//        System.out.println(fibonacci(10));
        System.out.println(fiboFormula(50));
    }
    //cannot give ans for n = 50
    static  int fibonacci(int x){
        if(x<2){
            return x;
        }
        return fibonacci(x-1)+fibonacci(x-2);
    }
    //it can give ans for 50
    static long fiboFormula(int n){
        //use long,instead of int
        return (long)Math.pow(((1+Math.sqrt(5))/2),n);
    }

}
