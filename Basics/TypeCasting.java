import java.util.*;
class TypeCasting{
    public static void main(String[] args){
        float a = 257f;
        int alpha = (int)(a);
        double beta = (double)(a);
        byte gamma = (byte)(a); // maximum value 256
        System.out.println(alpha);
        System.out.println(beta);
        System.out.println(gamma); // more than 256 --> 257%256=10

        //java promoting the byte into integer during execution
        byte x=40;
        byte y=50;
        byte z= 100;
        int d=  x*y/z;
        System.out.println(d);


        int num ='A';
        System.out.println(num); // amt type conversion 
        // askii value


        
    }
}