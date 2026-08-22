package MathsForDSA;

public class FindUnique {
    public static void main(String[] args) {
     int[] arr = {1,3,1,4,3,5,7,7,5,9,9};
        System.out.println(uniqueNum(arr));
    }
    public static int uniqueNum(int[] arr){
        int ans = 0;
        for(int n:arr){
            ans^=n;
        }
        return ans;
    }
}
