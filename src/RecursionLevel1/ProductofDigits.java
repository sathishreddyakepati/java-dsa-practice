package RecursionLevel1;

public class ProductofDigits {
    public static void main(String[] args) {
        System.out.println(productD(123));

    }
    static int productD(int n){
        if(n%10 == n){
            return n;
        }
        int d = n%10;
        return d* productD(n/10);
    }
}
