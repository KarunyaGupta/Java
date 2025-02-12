import java.util.*;
class FindPermutations{
    public static void main(String[] args){
        String str = "abc";
        findPermutation(str,"");

    }
    public static void findPermutation(String str , String ans){
        // basecase
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            String NewStr = str.substring(0,i) + str.substring(i+1,str.length());  // i doesnt count
            findPermutation(NewStr,ans+ch);
        }
    }
}