package Lectures.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 15;
        System.out.println(floor(nums,target));

    }
    //return the index: greatest number less than or equal to target
    //if element not found return -1
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(target<arr[0]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target) {
                start = mid + 1;
            }
            else if(arr[mid]>target) {
                end = mid-1;
            }
        }
        return end;
    }
}
