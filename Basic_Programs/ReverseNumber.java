import java.util.*;
class ReverseNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = in.nextInt();
        int reverseNum = 0;

        while(number>0){
            int rem = number%10;
            number = number/10; // individual digit

            reverseNum = reverseNum *10 + rem;

        }
        System.out.println(reverseNum);
        
       
    }
}