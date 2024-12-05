import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner inputValue =new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = inputValue.nextLine();
        System.out.println("UserName : " + username);

        // char v = inputValue.nextLine();
        // System.out.println(v);
        
        
       
    }
}


//nextBoolean()	Reads a boolean value from the user
// nextByte()	Reads a byte value from the user
// nextDouble()	Reads a double value from the user
// nextFloat()	Reads a float value from the user
// nextInt()	Reads a int value from the user
// nextLine()	Reads a String value from the user
// nextLong()	Reads a long value from the user
// nextShort()	Reads a short value from the user