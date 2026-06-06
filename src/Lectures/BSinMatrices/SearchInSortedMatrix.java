package Lectures.BSinMatrices;
import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int t = 12;
        System.out.println(Arrays.toString(findTarget(matrix,t)));

    }
    static int[] binarySearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid = cstart+(cend - cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }
            else{
                cend= mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] findTarget(int[][] mat,int target){
        int rows = mat.length;
        int cols = mat[0].length;
        if(rows==1){
            return binarySearch(mat,0,0,cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;
        while(rStart <(rEnd-1)){
            int mid = rStart+(rEnd - rStart)/2;
            if (mat[rStart][cMid]==target){
                return new int[]{rStart,cMid};
            }
            if(mat[rStart][cMid]<target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(mat[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(mat[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half

        if(target<=mat[rStart][cMid]){
            return binarySearch(mat, rStart, 0, cMid - 1, target);
        }
        //search in 2nd half
        if(target>=mat[rStart][cMid] && target<=mat[rStart][cols-1]){
            return binarySearch(mat, rStart, cMid+1, cols-1, target);
        }
        //search in 3rd half
        if(target<=mat[rStart+1][cMid]){
            return binarySearch(mat, rStart+1, 0, cMid-1, target);
        }

        //search in 4th half
        else{
            return binarySearch(mat, rStart+1, cMid+1, cols-1, target);
        }

    }





}

