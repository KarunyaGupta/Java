import java.util.*;
class PalindromeWordInString{
    public static void main(String[] args){
        String sentence = "mom and dad are my best friend";
       String[] words = sentence.split(" ");
        int count=0;
       for(int i=0;i<words.length;i++){
        if(palindrom(words[i])){
            count++;
        }
       }
        System.out.println(Arrays.toString(words));
        System.out.println(count);
    }

    public static boolean palindrom(String sentence){
        
        int start = 0;
        int end = sentence.length() -1;

        while(start<=end){
            if(sentence.charAt(start)!=sentence.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}