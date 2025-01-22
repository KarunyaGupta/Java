import java.util.*;
public class Subseq{
    public static void main(String[] args){
        
        ArrayList <String> list = new ArrayList<>();
        
        subseq("","abcd",list);
        System.out.print(list);

    }


    
    static void subseq(String p , String up , ArrayList<String>list){
        // p = processed , up = unprocessed
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p,up.substring(1),list); // ignore it 
        subseq(p+ch,up.substring(1),list); // add it 
        
    }
}