package RecursionArrayQuestions;

import com.sun.jdi.connect.Connector;

import java.util.ArrayList;

public class FindTarget {
    public static void main(String[] args) {
        int[] arr ={1,3,5,18,9};
        System.out.println(find(arr,18,0));
        System.out.println(findIndex(arr,18,0));
        System.out.println(findIndexLast(arr,18, arr.length-1));
        int[] arr1 ={1,3,5,3,18,9,3};
        ArrayList<Integer> ans = findAllIndex1(arr1,3,0,new ArrayList<>());
        System.out.println(ans);

    }
    static boolean find(int[] arr, int tar, int ind){
        if(ind == arr.length){
            return false;
        }
        return arr[ind] == tar || find(arr,tar,ind+1);
    }
    static int findIndex(int[] arr, int tar, int ind){
        if(ind == arr.length){
            return -1;
        }
        if(arr[ind]==tar){
            return ind;
        }
         else{
            return findIndex(arr,tar,ind+1);
        }
    }
    static int findIndexLast(int[] arr, int tar, int ind){
        if(ind == -1){
            return -1;
        }
        if(arr[ind]==tar){
            return ind;
        }
        else{
            return findIndexLast(arr,tar,ind-1);
        }
    }
//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int tar, int ind){
//        if(ind == arr.length){
//            return ;
//        }
//        if(arr[ind]==tar){
//            list.add(ind);
//        }
//        findAllIndex(arr,tar,ind+1);
//    }
    static ArrayList<Integer> findAllIndex1(int[] arr, int tar, int ind, ArrayList<Integer> list){
        if(ind == arr.length){
            return list ;
        }
        if(arr[ind]==tar){
            list.add(ind);
        }
        return findAllIndex1(arr,tar,ind+1,list);
    }
}
