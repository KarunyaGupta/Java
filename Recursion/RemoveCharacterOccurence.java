import java.util.*;

class RemoveCharacterOccurence{
    public static void main(String[] args){
        String str = "Karunya";
        String lowerStr = str.toLowerCase();
        // System.out.print(lowerStr);
        char toRemove = 'a';

        String res = remove(str,toRemove,0);
        System.out.print(res);
    }
    public static String remove(String str, char toRemove , int start){
        if(start == str.length()){
            return "";
        }
        if(str.charAt(start) != toRemove){
            return str.charAt(start) + remove(str,toRemove,start+1);
        }

        return remove(str,toRemove,start+1);

        
    }
}