package RecursionArrayQuestions;

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 9, 4, 5};
        System.out.println(checkSortArray(nums,0));

    }
    //ascending order
    static boolean checkSortArray(int[] arr, int pos){
        //base condition : if index = arr.length - 1 ,return true
        if(pos==arr.length-1){
            return true;
        }
        return arr[pos]<arr[pos+1] && checkSortArray(arr,pos+1);
    }
}
