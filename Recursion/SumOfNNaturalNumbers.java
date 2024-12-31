import java.util.*;
class SumOfNNaturalNumbers{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(sum(n));
    }

    public static int sum(int n){
        if(n==0){
            return -1;
        }else{
            return (n+sum(n-1));
        }
    }
}