import java.util.*;
 class Methods{
    public static void main(String[] args){
        // take input of two numbers and print the sum
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum = " + sum);


    }
}