package Lectures.RecursionIntro23;

public class BinarySearchwithRecursion {
    static boolean BinarySearch(int[] arr,int st,int end,int target){
        if(st>end){
            return false;
        }
        int mid = (st+end)/2;
        if(arr[mid] == target){
            return true;
        }
        if(arr[mid]<target){
             return BinarySearch(arr,mid+1,end,target);
        }
        if(arr[mid]>target) {
            return BinarySearch(arr, st, mid - 1, target);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,6,8,19,56,78};

        System.out.println(BinarySearch(nums,0,7,4));

    }
}
