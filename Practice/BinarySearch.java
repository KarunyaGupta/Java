import java.util.*;
class BinarySearch{

    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = in.nextInt();
        }
        int element = in.nextInt();

        int left = 0;
        int right = arr.length -1;
        while(left<=right){
            if(arr[left] == target){
                return left;
            }
        }
    }
}