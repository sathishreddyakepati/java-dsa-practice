package Lectures.LectureQuestions;

public class MaximumItem {
    public static void main(String[] args) {
        int[] nums = {1,4,66,78,9};
        maximumof(nums);
    }
    static void maximumof(int[] arr){
        int max = arr[0];
        for(int i = 1;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum item is "+max+" .");
    }
}
