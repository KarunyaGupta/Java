// if the array filled than java autodetect it and maek an another array of 2X size 
// and coly all the elements

import java.util.*;

class Swap2Numbers{
    public static void main(String[] args){
        Scanner in  = new Scanner(System.in);
        // int[] arr = new int[10];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            int temp = in.nextInt();
            list.add(temp);
        }
        
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        System.out.println(list);
        swap(list , i1, i2);

            
        
        System.out.println(list);

           
    }
    public static void swap(ArrayList<Integer> list , int i1, int i2){
        int temp = list.get(i1);
        list.set(i1, list.get(i2));
        list.set(i2 , temp);

    }
}