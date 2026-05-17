package Lectures.LinearSearch13;

public class SearchInStrings {
    public static void main(String[] args) {
        String name ="Sathish";
        char x = 'k';
        System.out.println(search(name,x));

    }
    static boolean search(String s,char target){
        if(s.length() == 0){
            return false;
        }
        for(int i =0;i<s.length();i++){
            if(target == s.charAt(i)){
                return true;
            }
        }
        return false;

    }
    static boolean search2(String s,char target){
        if(s.length() == 0){
            return false;
        }
        for(char ch :s.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;

    }

}
