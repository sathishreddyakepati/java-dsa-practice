package Lectures;

public class Shadowing {
    static int x = 90;
    //variable length argument should be passed at last
    //ex:
    /*void length(int a,int b,String ...v){}*/


    public static void main(String[] args) {
        System.out.println(x);//90
        int x = 50;
        System.out.println(x);//50
        func();
    }
    static void func(){
        System.out.println(x);
    }

}
