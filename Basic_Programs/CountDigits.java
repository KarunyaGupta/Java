import java.util.*;
class CountDigits{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a number");
        int number = in.nextInt();
        System.out.println("Enter a number you want to check");
        int numberCheck = in.nextInt();
        int count =0; 
        while(number>0){
            int rem = number%10 ;
            number = number/10;
            if(rem == numberCheck){
                count++;
            }
        

        }
        System.out.println("The digit "+numberCheck +" occures "+ count +" times!");
        
       
    }
}