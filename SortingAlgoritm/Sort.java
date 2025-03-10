import java.util.Scanner;
import java.util.Arrays;
class Sort{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
    }
}