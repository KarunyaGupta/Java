import java.util.*;
class StringStack{
    public static void main(String[] args){
        Stack<String> s = new Stack<>();
        String str = "Hello World !";
        String[] words = str.split(" ");
        for(String word : words){
            s.push(word);
        }

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}