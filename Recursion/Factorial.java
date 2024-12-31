import java.util.*;
class Factorial{
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.print(factorial(n));
    }

    //recursion function
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1); // function again call
        }
    }
}