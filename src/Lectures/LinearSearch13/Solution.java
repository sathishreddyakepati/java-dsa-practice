package Lectures.LinearSearch13;

public class Solution {
    public static void main(String[] args) {
        int[] nums ={12,345,2,6,7896};
        System.out.println(findNumbers(nums));

    }
//    static boolean even(int num){
//        int x = num;
//        int NoDigits =0;
//        while(x>0){
//            int d = x%10;
//            x = (x - d)/10;
//            NoDigits++;
//        }
//        if(NoDigits%2==0){
//            return true;
//        }
//        return false;
//    }
    static boolean even2(int num){
        int NoDigits =digits(num);
        if(NoDigits%2==0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        if(num<0){
            num=num*(-1);
        }
        return (int)(Math.log10(num)+1);

    }
   static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even2(num)){
                count++;
            }
        }
        return count;

    }
}