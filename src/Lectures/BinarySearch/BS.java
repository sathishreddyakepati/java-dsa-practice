package Lectures.BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] nums = {-5,-1,2,3,4,6,8,9,24,28,98,99,109};
        int target = 2;
        System.out.println(binarySearch(nums,target));

    }
    //return the index
    //if element not found return -1
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
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
        return -1;
    }
}
