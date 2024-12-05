import java.util.*;
class PrintStringLetters{
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Str = UserInput.nextLine();
        for(int i=0;i<Str.length();i++){
            System.out.println(Str.charAt(i));
            

        }
        
    }
}