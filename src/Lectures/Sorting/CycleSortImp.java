package Lectures.Sorting;

import java.util.Arrays;

public class CycleSortImp {
    public static void main(String[] args) {
        int[] arr  = {3,5,2,1,4};
        System.out.println(Arrays.toString(CS(arr)));

    }
    static void swap(int[] arr,int n1,int n2){
        int temp = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = temp;
    }
    static int[] CS(int[] arr){

        int index = 0;
        while(index<arr.length-1){
            if(arr[index]!= index+1){
                swap(arr,arr[index]-1,index);
            }
            else{
                index++;
            }
        }
        return arr;
    }


}
