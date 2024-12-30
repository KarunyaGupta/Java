import java.util.*;
class Toggled{
    public static void main(String[] args){
        String str = "KarunYa GuPta";
        System.out.println(toUpperCase(str));
    }
         
           
        
    public static String toUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        // for(int i=0;i<str.length();i++){
        //     char ch = Character.toUpperCase(str.charAt(i));
        //     sb.append(ch);

            
        // }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
        }
        return sb.toString();

    }
}