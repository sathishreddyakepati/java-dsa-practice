package Lectures.BSinMatrices;
import java.util.*;

public class RowWiseandColWiseSorted {
    public static void main(String[] args) {
        int[][] mat = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int t = 38;
        System.out.println(Arrays.toString(findTarget(mat,t)));
    }
    static  int[] findTarget(int[][] arr,int target){
        int r = 0;
        int col = arr.length - 1;
        while(r<arr.length && col>=0){
            if(arr[r][col]==target){
                return new int[]{r,col};
            }
            if(arr[r][col]<target){
                r++;
            }
            if(arr[r][col]>target){
                col--;
            }
        }
        return new int[]{-1,-1};
    }
}
