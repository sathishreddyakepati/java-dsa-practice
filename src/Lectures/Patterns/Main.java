package Lectures.Patterns;

public class Main {
    public static void main(String[] args) {
        pattern31(4);

    }
    static void pattern31(int n){
        int originalN = n;
        n=n*2;
        for(int row = 0;row<n;row++){
            for(int col=0;col<n;col++){
                int atEveryIndex =originalN- Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int row = 1;row<2*n-1;row++){
            int c = row>n? 2*n-row:row;
            for(int s = 1;s<=n-c;s++){
                System.out.print(" ");
            }

            for(int col=c;col>=1;col--){
                System.out.print(col);
            }
            for(int col= 2;col<=c;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern30(int n){
        for(int row = 1;row<=n;row++){
            //spaces
            for(int s = 1;s<=2*n-2*row;s++){
                System.out.print(" ");
            }

            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col= 2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
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

    static void pattern6(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    static void pattern28(int n){

        for(int row=0;row<2*n;row++){
            int totalColsInRow = row > n ? 2 * n-row:row ;
            int spaces = n - totalColsInRow;
            for(int s = 1;s<=Math.abs(n-row);s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
