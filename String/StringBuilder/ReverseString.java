import java.util.*;
class ReverseString{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        StringBuilder sb = new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        System.out.print(reverse);
    }
}