package Lectures.Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {4,5,1,2,3};
        System.out.println(Arrays.toString(SS1(nums)));
    }
    //direct selection sort
    static int[] SS(int[] arr){
        int n = arr.length;
        for(int i =0;i<n-1;i++) {
            int max = 0;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] >arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[n-1-i];
            arr[n-1-i] = temp;
        }
        return arr;
    }
    //selection sort with functions for max index and swapping
    static int[] SS1(int[] arr){
        for(int i =0;i<arr.length;i++){
            int maxIndex = findmaxIndex(arr,0,arr.length-i-1);
            swap(arr,maxIndex, arr.length-i-1);
        }
        return arr;
    }
    //for finding max element index
    static int findmaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start;i<=end;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    //for swapping
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
