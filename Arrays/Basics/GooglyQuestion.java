import java.util.*;
class GooglyQuestion{
    public static void main(String[] args){
        int array[] = {10, 20, 30, 40, 50};
        for (int i = 1; i < 5; i++)
        {
            array[i] = array[i - 1];
        }
        System.out.print(Arrays.toString(array));
    }
}