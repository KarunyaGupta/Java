import java.util.*;
class StringBuilderCoder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("KARUNYA");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0 , 'P');
        System.out.println(sb);
    }
}