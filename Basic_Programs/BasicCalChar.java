import java.util.*;
class BasicCalChar{
    public static void main(String[] args){
        Scanner UserInput = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1= UserInput.nextInt();
        System.out.println("Enter the Second number: ");
        int num2= UserInput.nextInt();
        System.out.println("Which operation you want to perform : ");
        char operation = UserInput.next();
        int logicOutput = 0;
        switch(operation){
            case '+':
                logicOutput += num1+num2;
                break;
            case '-':
                if(num1>num2){
                    logicOutput += num1-num2;
                }else{
                    logicOutput += num2-num1;
                }
                break;
            case '*':
                logicOutput += num1*num2;
                break;
            case '/':
                if(num2==0){
                    System.out.println("Error: Division by zero is not allowed");
                }else{
                    logicOutput += num1/num2;
                }
                break;
            case '%':
                logicOutput += num1%num2;
                break;
            default:
                System.out.println("Enter valid operator");
        
        }
        System.out.println(num1 + operation + num2 +"="+ logicOutput);

        

        
    }
}