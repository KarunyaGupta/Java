import java.util.*;
class IdxOutOfBound{
    public static void main(String[] args){
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));

        try{
            System.out.println(arr[20]);
        }catch(Exception e){
            System.out.println("Index Out Of Bound");
        }
    }
}