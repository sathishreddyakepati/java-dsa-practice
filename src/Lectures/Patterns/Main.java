package Lectures.Patterns;

public class Main {
    public static void main(String[] args) {
        pattern5(7);

    }
    static void pattern1(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=n-row+1;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int row = 1;row<=2*n-1;row++){
            if(row<=n){
                for(int col = 1;col<=row;col++){
                    System.out.print("*");

                }
            }
            else{
                for(int col = n;col>row - n;col--){
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
