import java.util.*;
class FebonacciNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b= 1;
        System.out.println("Enter the range from 0 to :");
        int n = in.nextInt();

        int count = 2;  
        while(count <=n){
            int temp = b;
            b=b+a;
            a = temp;
            count++;

        }
        System.out.println(b);

       
    }
}