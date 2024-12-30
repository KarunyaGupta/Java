import java.util.*;
class Compare2String{
    public static void main(String[] args){
        String name = "Karunya";
        String name1 = "Karunya";
        String name2 = new String("Karunya");
        if(name == name1 && name == name2){
            System.out.println("same");
        }else{
            System.out.println("different by new keywoad");
        }

        System.out.println(name1.equals(name2)); // true

        // substring

        String sentence = "Hello my name is karunya gupta";
        String word = "karunya";
        
        System.out.println(sentence.contains(word));
        
        
    }
}