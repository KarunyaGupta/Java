import java.util.*;
class P1{
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> list = subsets(arr);
        System.out.print(list);

    }

    public static List<List<Integer>> subsets(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<(1<<n);i++){
            ArrayList<Integer> subset = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0){
                    subset.add(arr[j]);
                }
            }
            list.add(subset);
        }
        return list;
    }
}