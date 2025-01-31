import java.util.*;
class GreatestCommonDivision{
    public static void main(String[] args){

       Scanner in = new Scanner(System.in);
       int x = in.nextInt();
       int y = in.nextInt();

        // for(int i=1;i<100;i++){
        //     if(x%i==0 && y%i==0){
        //         System.out.print(i + " ");
        //     }
        // }

        int res = igcd(x,y);
        // System.out.println(res);
        System.out.print(gcd(x,y));

    }

    public static int igcd(int x , int y){
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }

        return y;
    }
    // using recursion
    public static int gcd(int x , int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}