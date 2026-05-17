package Lectures.LinearSearch13;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] nums ={{1,4,5},{56,78,90,9},{12,32,45,9,8}};
        int target = 45;
        System.out.println(Arrays.toString(search2(nums,target)));

    }
    static boolean search(int[][] arr,int target){
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target == arr[row][col]){
                    return true;
                }
            }
        }
        return false;
    }
    static int[] search2(int[][] arr,int target){
        for(int row =0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(target == arr[row][col]){
                    return new int[]{row,col};
                }
            }

        }
        return new int[]{-1,-1};
    }


}
