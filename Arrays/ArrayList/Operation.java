// if the array filled than java autodetect it and maek an another array of 2X size 
// and coly all the elements

import java.util.*;

class Operation{
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
         // time complexity --> O(1) to all

        list.add(1,9);

        System.out.println(list);


        // get operation 
        int element = list.get(1);  //-->  O(1)
        System.out.println(element);   

        // remove operation 

        list.remove(1);
        System.out.println(list);
        System.out.println(list.size()); // use in ArrayList and in array we use length


        // set element at index 

        list.set(2,100);
        System.out.println(list);


        // contain element --> check the existance of element
        System.out.println(list.contains(1));


           
    }
}