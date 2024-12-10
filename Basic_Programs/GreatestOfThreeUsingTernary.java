import java.util.*;
class GreatestOfThreeUsingTernary{ 
    public static void main(String[] args) {
        
        int a = 15;
        int b = 100, c = 45;
        int max = (a > b) ? ((a > c)d a : c) : ((b > c) ? b : c);
        int max = logic(a,b,c);
        System.out.println(max);

    }
    // public static int logic(int a, int b, int c){
    //     int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    //     return max;
    // }
}