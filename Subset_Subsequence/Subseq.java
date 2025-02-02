import java.util.*;
public class Subseq{
    public static void main(String[] args){
        
        ArrayList <String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> matrix = new ArrayList<>();
        subseq("","ab",matrix);
        System.out.print(matrix);

    }


    
    static void subseq(String p , String up , ArrayList<ArrayList<String>>matrix){
        // p = processed , up = unprocessed
        ArrayList<String> list = new ArrayList<>();
        if(up.isEmpty()){
            // System.out.println(p);
            list.add(p);
            matrix.add(list); 
            return;
        }
        char ch = up.charAt(0);
        subseq(p,up.substring(1),matrix); // ignore it 
        subseq(p+ch,up.substring(1),matrix); // add it 
        
    }
}