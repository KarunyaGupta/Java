import java.util.*;

class ChangeTheIndexOfArray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,5,6};
        Change(arr);

        System.out.println(Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        
    }

    static void Change(int[] num){
       num[0]= 30;
       
        // for(int i=0;i<num.length;i++){
        //     num[i] = 99;
        // }
    }

    
}