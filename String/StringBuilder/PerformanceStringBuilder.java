import java.util.*;
class PerformanceStringBuilder{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder(""); // immutable
        // System.out.print(a);
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i) ;
            builder.append(ch);
            builder.append(" ");
        }
        System.out.println(builder); // no new object created it just add on it

        builder.reverse(); // reverse the string
        System.out.println(builder);
    }
}