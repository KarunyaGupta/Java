import java.util.*;
class VariableLengthArguments{
    public static void main(String[] args){
        fun(2,3,4,5,5,6,7,8,8,9,9);
        multiple(2,3,"karunya","hello","Gupta");

    }

    static void multiple(int a , int b , String ...v){
        
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}