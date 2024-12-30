import java.util.*;
class Compare2String{
    public static void main(String[] args){
        String name = "Karunya";
        String name1 = "Karunya";
        String name2 = new String("Karunya");
        if(name == name1 && name == name2){
            System.out.print("same");
        }else{
            System.out.print("different by new keywoad");
        }


        // substring

        String sentence = "Hello my name is karunya gupta";
        String word = "karunya";
        if(sentence.contains(word)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
    }
}