import java.util.*;

class ReverseString{
    public static void main(String[] args){
        String str ="Karunya";
        System.out.print(rev(str,0));
    }

    public static String rev(String orgStr , int start){
        if(start==orgStr.length()){
            return "";
        }
        return rev(orgStr,start+1)+orgStr.charAt(start);
    }
}