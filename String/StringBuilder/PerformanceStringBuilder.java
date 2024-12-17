import java.util.*;
class PerformanceStringBuilder{
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder(); // immutable
        // int a = 'a';
        // System.out.print(a);
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.print(builder);
    }
}