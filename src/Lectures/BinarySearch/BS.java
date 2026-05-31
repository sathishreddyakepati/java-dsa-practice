package Lectures.BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] nums = {-5, -1, 2, 3, 4, 6, 8, 9, 24, 28, 98, 99, 109};
        int target = 2;
        System.out.println(binarySearch(nums, target));

    }

    //return the index
    //if element not found return -1
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    //array not containing duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    //array containing duplicates
    static int findPivot1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                end = mid - 1;
            }
            //if elements at start,mid,end are equal then skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE:what if these elements at start and end were pivots
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check if end is pivot or not
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }
        }
        return -1;
    }
}

