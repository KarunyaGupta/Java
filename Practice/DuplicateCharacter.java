import java.util.*;
class DuplicateCharacter{
    public static void main(String[] args){
        String sentence = "Hello world !!";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<sentence.length()-1;i++){
            for(int j=i+1;i<sentence.length()-1;j++){
                if(sentence.charAt(i) == sentence.charAt(j)){
                    sb.append(sentence.charAt(i));
                }
            }
        }
        System.out.println(sb.toString());
        
    }
}