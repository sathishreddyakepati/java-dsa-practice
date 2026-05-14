package Lectures.LectureQuestions;

import java.util.Arrays;

public class MaxIteminRange {
    public static void main(String[] args) {
        int[] nums ={23,45,44,67,88,90};
        reverse(nums);
        System.out.println(Arrays.toString(nums));
//        System.out.println(maxInRange(nums,0,3))

    }
    static int maxInRange(int[] arr,int index1,int index2){
        if(index1>index2){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int max = arr[index1];
        for(int i = index1+1;i<=index2;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start = start + 1;
            end = end - 1;
        }
    }

}
