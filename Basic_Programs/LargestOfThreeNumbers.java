import java.util.*;
class LargestOfThreeNumbers{
    public static void main(String[] args){

        Scanner UserInput = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int first = UserInput.nextInt();
        System.out.println("Enter Second number : ");
        int second = UserInput.nextInt();
        System.out.println("Enter Third number : ");
        int third = UserInput.nextInt();
        int output;


        if(first>second && first>third){
            output = first;
        }else if(second>first && second>third){
            output = second;
        }
        else{
            output = third;
        }

        System.out.println("The largest number is : " + output);
    }
}