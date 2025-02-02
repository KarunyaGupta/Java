import java.util.*;

class ReverseString{
    public static void main(String[] args){
        String str ="racecar";
        // System.out.print(rev(str,0));

        if(str.length()==1 || str.length()==0){
            System.out.println(1);
        }
        String reverseStr = rev(str,0);
        // boolean flag = true;
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!=reverseStr.charAt(i)){
        //         flag = false;
        //     }
        // }
        // System.out.print(flag);


        boolean flag = false;
        if(reverseStr.equals(str)){
            flag = true;
        }
        System.out.print(flag);


    }

    public static String rev(String orgStr , int start){
        if(start==orgStr.length()){
            return "";
        }
        return rev(orgStr,start+1)+orgStr.charAt(start);
    }
}