package Lectures.StringsinJava;

public class Main {
    public static void main(String[] args) {
        String a = "Sathish";

        String b = "Sathish";
        String c = a;
        System.out.println(a == c);
//        if(a.equals(b)){
//            System.out.println("Equal");
//        }
        // == checks if reference variables are pointing to same object
        //How to create diff objects of same value
        // use new
        String name1= new String("Kunal");
        String name2= new String("Kunal");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));




    }
}
