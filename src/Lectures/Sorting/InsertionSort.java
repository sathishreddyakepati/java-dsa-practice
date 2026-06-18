package Lectures.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      int[] nums = {3,5,4,1,2};
        System.out.println(Arrays.toString(IS(nums)));
    }
    static int[] IS(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]) {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
