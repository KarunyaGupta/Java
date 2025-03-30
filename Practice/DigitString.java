import java.util.*;
class DigitString{
    public static void main(String[] args){
        String str ="1sdf";
        boolean isdigit = true;
        for(int i=0;i<str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                isdigit = false;
                break;
            }
        }
        System.out.print(isdigit);
    }
}