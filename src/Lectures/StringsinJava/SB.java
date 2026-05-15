package Lectures.StringsinJava;

public class SB {
    public static void main(String[] args) {
        //here builder is mutable
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
