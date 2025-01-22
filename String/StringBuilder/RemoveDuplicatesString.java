import java.util.*;
class RemoveDuplicatesString {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is Powerful";
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            boolean isDuplicate = false;
            for(int j=0;j<i;j++){
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break; 
                }
            }
            if (!isDuplicate) {
                sb.append(words[i]).append(" ");
            }
            
        }
        System.out.print(sb.toString().trim());
    
    }
}