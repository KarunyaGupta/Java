import java.util.*;
class UpdateOrInsert{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        System.out.println(arr[3]);
        arr[9] = 3;
        System.out.print(Arrays.toString(arr));
    }
}