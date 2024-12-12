// find if any pair in a sorted arraylist has a target sum

// Brute Force -> all possible pairs 

import java.util.*;
public class PairSum{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> list = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        int arrSize = in.nextInt();
        System.out.print("Enter " + arrSize + " elements : ");

        for(int i=0;i<arrSize;i++){
            int temp = in.nextInt();
            list.add(temp);
        }
        int target = 5;
        System.out.println(pairSum1(list, target));   
    }
    
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i) + list.get(j)== target){
                    System.out.println(list.get(i) +" "+list.get(j));
                    return true;
                    
                }
            }
        }
        
        return false;
    }

}