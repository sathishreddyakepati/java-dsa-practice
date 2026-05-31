package Lectures.BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr ={3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
        int st  = 0;
        int end = 1;
        int loc = -1;
        while(target > arr[end]){
                int Newst = end + 1;
                end = end + (end -st+1)*2;
                st = Newst;

        }
        loc = binarySearch(arr,target,st,end);
        return loc;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
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
