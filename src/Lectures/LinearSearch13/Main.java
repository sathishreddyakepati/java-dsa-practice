package Lectures.LinearSearch13;

public class Main {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,78,90};
        int target = 5;
        System.out.println(searchElement(arr,target));

    }
    //search for element in array ,if found return index
    //if element not found return -1
    static int searchElement(int[] arr,int target){
        if(arr.length ==0){
            return -1;
        }
        for(int i =0;i<arr.length;i++){
            if(target == arr[i]){
                return i;
            }
        }
        return -1;
    }

}
