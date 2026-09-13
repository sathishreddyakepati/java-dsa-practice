package RecursionArrayQuestions;
import java.util.ArrayList;
//without passing list as argument
public class ReturnList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        System.out.println(getAllIndexs(arr,4,0));

     }
    static ArrayList<Integer> getAllIndexs(int[] arr,int t, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index== arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == t){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = getAllIndexs(arr,t,index+1);
        list.addAll(ansFromBelowCalls);
        return list;

    }
}
