import java.util.*;
 class Greeting{
    public static void main(String[] args){
        // take input of two numbers and print the sum
        
        String gre =  Greet();
        System.out.println("Hey I greet you "+ gre);
        
        


    }
    static String Greet(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter greeting comment :  ");
        String  gr = in.nextLine();

        //System.out.println("The sum = " + sum);
        return gr; 
    }
}