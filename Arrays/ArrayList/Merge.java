import java.util.*;
class Merge{
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,3};
        int[] arr2 = {3,5,3,2,1,4};
        ArrayList <Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr2[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        Collections.sort(list);
        System.out.print(list);
    }
}