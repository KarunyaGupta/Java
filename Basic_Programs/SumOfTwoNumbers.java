import java.util.*;

class SumOfTwoNumbers{
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = UserInput.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = UserInput.nextInt();
        int sum = num1+num2;
        System.out.println("The sum of the two numbers is: "+ sum);
    }
}