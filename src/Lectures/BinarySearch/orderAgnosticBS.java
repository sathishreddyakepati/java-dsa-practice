package Lectures.BinarySearch;

public class orderAgnosticBS {
    public static void main(String[] args) {
        int[] nums = {110,99,98,90,76,56,45,41,23,22,7,5,3,-1};
        int target = 5;
        System.out.println(binarySearch(nums,target));

    }
    static int binarySearch(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        //find whether array is sorted in ascending/descending order
        boolean isAsc = arr[start] < arr[end] ? true : false;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                if (isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (arr[mid] > target) {
                if (isAsc) {
                    end = mid - 1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}
