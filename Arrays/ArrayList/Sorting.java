// if the array filled than java autodetect it and maek an another array of 2X size 
// and coly all the elements

import java.util.*;

class Sorting{
    public static void main(String[] args){
        ArrayList<Integer>list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
         // time complexity --> O(1) to all

        list.add(1,9);
        list.add(2,10);
        Collections.sort(list); // array list 
        // accending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // decending
        System.out.println(list);



           
    }
}