import java.util.*;
class PairSumPointerAproach{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter the size of array: ");
        int arrSize = in.nextInt();
        System.out.print("Enter " + arrSize + " elements : ");

        for(int i=0;i<arrSize;i++){
            int temp = in.nextInt();
            list.add(temp);
        }
        int target = 5;
        pairSum1(list, target);
    }
    public static boolean pairSum1(ArrayList<Integer>list , int target){
        int leftprtr = 0;
        int rightptr = list.size()-1;
        while(leftprtr!= rightptr){
            if(list.get(leftprtr) + list.get(rightptr)== target){
                System.out.print(list.get(leftprtr) + " " + list.get(rightptr));
                return true;
            }
            else if(list.get(leftprtr)+ list.get(rightptr)<target){
                leftprtr ++;
            }else if(list.get(leftprtr) + list.get(rightptr)>target){
                rightptr--;
            }
        }
        return false;
    }
}