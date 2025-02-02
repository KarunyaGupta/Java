import java.util.*;
class KeypadCombination{
    public static void main(String[] args){
        String s = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combinations(s,kp,"");

    }
    public static void combinations(String dig , String[]kp ,String res){
        if(dig.length()==0){
            System.out.print(res + " ");
            return;
        }
        int curr = dig.charAt(0) -'0'; // convert string into integer;
        String currChoice = kp[curr];
        for(int i=0;i<currChoice.length();i++){
            combinations(dig.substring(1),kp,res+currChoice.charAt(i));
        }
    }
}