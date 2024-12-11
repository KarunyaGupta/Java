import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=0;i<4;i++){
            int temp = in.nextInt();
            arr.add(temp);
        }
        ArrayList<Integer>arr1 = new ArrayList<>();
        for(int i=0;i<3;i++){
            int temp = in.nextInt();
            arr1.add(temp);
        }
        ArrayList<Integer>arr2 = new ArrayList<>();
        for(int i=0;i<5;i++){
            int temp = in.nextInt();
            arr2.add(temp);
        }

        list.add(arr);
        list.add(arr1);
        list.add(arr2);

        System.out.print(list);


        // for(int i=0;i<list.size();i++){
        //     ArrayList<Integer> currList = list.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.println(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }

        // System.out.println(list);

        
    }
}