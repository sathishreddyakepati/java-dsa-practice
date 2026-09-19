package RecursionPatternsQnsBubblesrtSelectionSrt;

import java.util.Arrays;

// n = 4
//* * * *
//* * *
//* *
//*
public class Pattern1 {
    public static void main(String[] args) {
//        patternV3(4, 0);
        int[] arr = {4, 3, 2 ,1};
//        bubbleSort(arr,arr.length-1,0);
        selectionSort(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }

    public static void patternV1(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("* ");
        }
        System.out.println();
        patternV1(n-1);
    }
    public static void patternV2(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            System.out.print("* ");
            patternV2(r, c+1);
        }
        else{
            System.out.println();
            patternV2(r-1, 0);
        }
    }
    public static void patternV3(int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            patternV3(r, c+1);
            System.out.print("* ");
        }
        else{
            patternV3(r-1, 0);
            System.out.println();
        }
    }
    //bubble sort
    public static void bubbleSort(int[] arr,int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                //swap;
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,r, c+1);
        }
        else{
            bubbleSort(arr,r-1, 0);
        }
    }
    // selection sort
    public static void selectionSort(int[] arr,int r, int c,int maxIndex){
        if(r==0){
            return;
        }

        if(c < r){
            if(arr[c] > arr[maxIndex]){
                maxIndex = c;
            }
            selectionSort(arr,r, c+1,maxIndex);
        }
        else{
            int temp = arr[r-1];
            arr[r-1] = arr[maxIndex];
            arr[maxIndex] = temp;
            selectionSort(arr,r-1, 0,0);
        }
    }
}
