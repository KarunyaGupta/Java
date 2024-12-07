import java.util.*;
 class PassingValue{
    public static void main(String[] args){
        // take input of two numbers and print the sum
        
       
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        
        int ans = sum(x,y);
        System.out.println("The sum is : "+ ans);


    }
    static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    
}