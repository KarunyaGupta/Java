import java.util.*;
class Delete{
    public static void delete(int[] arr , int  target){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        delete(arr, 2);
        // System.out.println(Arrays.toString(arr));
    }
}