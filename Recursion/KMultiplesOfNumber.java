import java.util.*;
class KMultiplesOfNumber{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int number = in.nextInt();
        kMultiple(k,number);
    }

    public static void kMultiple(int k, int number){
        if(k<=0){
            return;
        }
        kMultiple(k-1,number);
        System.out.print(number * k + " ");
    }
}