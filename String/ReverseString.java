import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
       String original = "Karunya Gupta";
       // method 1
        //    for(int i=original.length()-1;i>0;i--){
        //     System.out.print(original.charAt(i));
        //    }

       // method 2
        StringBuilder sb = new StringBuilder(original);
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.print(sb); 
    }
}