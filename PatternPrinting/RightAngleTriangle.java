import java.util.*;
class RightAngleTriangle{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        for(int i=0;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
