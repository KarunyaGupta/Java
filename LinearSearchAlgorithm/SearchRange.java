import java.util.*;
class SearchRange{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int startRange = in.nextInt();
        int endRange = in.nextInt();
        int whatToFind = in.nextInt();
        boolean res = logic(arr,startRange,endRange,whatToFind);
        System.out.print(res);

    }
    public static boolean logic(int[] arr , int startRange,int endRange , int whatToFind){
        for(int i=startRange ; i<endRange;i++){
            if(whatToFind == arr[i]){
                return true;
            }
        }
        return false;
    }


    
}