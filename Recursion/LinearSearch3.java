import java.util.*;
class LinearSearch3{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,2,4,5,2,1,2,5,2,1};
        int target = 2;
        ArrayList<Integer>res = searchTarget(0,target,arr);
        System.out.print(res);
    }
    public static ArrayList <Integer> searchTarget(int i, int target , int[] arr){
        ArrayList<Integer>res = new ArrayList<>();
        if(i==arr.length){
            return res;
        }
        if(arr[i]==target){
            // System.out.print(i+" ");
            res.add(i);
        }
        ArrayList<Integer> nextResults = searchTarget(i + 1, target, arr);
        res.addAll(nextResults);
        
        return res;
    }
}
