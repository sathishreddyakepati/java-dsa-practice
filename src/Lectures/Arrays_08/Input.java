package Lectures.Arrays_08;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        /// array of primitives
        Scanner in = new Scanner((System.in));
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 44;
        arr[2] = 56;
        arr[3] = 99;
        arr[4] = 76;

        // Enhanced for loop
//        for(int num: arr) {
//            System.out.print(num + " ");
//
//        }
        // another way to print an array elements
//        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str = new String[4];
        for(int i = 0;i<str.length;i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
