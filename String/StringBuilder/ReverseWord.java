import java.util.*;
class ReverseWord{
    public static void main(String[] args){
        String s = "My name is karunya";
        System.out.print(reverseWord(s));
    }

    public static String reverseWord(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }
}