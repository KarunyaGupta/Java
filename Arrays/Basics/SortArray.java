// if the array filled than java autodetect it and maek an another array of 2X size 
// and coly all the elements

import java.util.*;

class SortArray{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

           
    }
}