package Lectures.StringsinJava;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Sathish Reddy Akepati";
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('s'));
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        // extra spaces in strings will be removed using strip method
        System.out.println(" sathish  ".strip());
        //split with regex conditions
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
