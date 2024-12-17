import java.util.*;
class StringBuilderCoder{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Karunya Gupta");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        sb.setCharAt(0 , 'P'); // set character at index
        System.out.println(sb);


        // insert
        sb.insert(0,"hey ");
        System.out.println(sb);


        sb.delete(0,4);
        System.out.println(sb);

        sb.append(" hey!");
        System.out.println(sb);
    }
}