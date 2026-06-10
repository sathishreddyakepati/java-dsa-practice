package Lectures.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-9,-55,-99,0,89,3};
        BubbleSortAlgorithm(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void BubbleSortAlgorithm(int[] arr){
        int n = arr.length;
        //run steps  for n- 1 times
        boolean swapped;
        for(int i = 0;i<n-1;i++){
            swapped = false;
            //for each step,max item will come at last respective index
            for(int j =1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            if(!swapped){
                return;
            }
        }
    }
}
