import java.util.*;
class ContainerWithMostWater{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("Enter the size of array: ");
        int arrSize = in.nextInt();
        System.out.print("Enter " + arrSize + " elements : ");

        for(int i=0;i<arrSize;i++){
            int temp = in.nextInt();
            list.add(temp);
        }


        
        System.out.print(MaxH20(list));
    }
    public static int MaxH20(ArrayList<Integer> height){
        // Brute force logic 
        int maxWater = 0;
        for(int i=0;i<height.size();i++){
            for(int j= i+1;j<height.size();j++){
                int ht  = Math.min(height.get(i) , height.get(j));
                int width = j-i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);

            }
        }
        return maxWater;
    }

}