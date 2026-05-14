package Lectures.Arrays_08;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(9);
//        list.add(90);
//        list.add(8);
//        list.add(45);
//        list.add(34);
//
//        System.out.println(list );
//        list.set(0,9999);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        //Multidimensional Array list
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        for(int i =0;i<3;i++){
            list1.add(new ArrayList<>());
        }
   }
}
