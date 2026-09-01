package RecursionLevel1;

public class OnetoN {
    public static void main(String[] args) {
        funcboth(5);

    }
    static void func(int n){
        if(n==0){
            return;
        }
        func(n-1);
        System.out.print(n+" ");
    }
    static void funcboth(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funcboth(n-1);
        System.out.print(n+" ");
    }
}
