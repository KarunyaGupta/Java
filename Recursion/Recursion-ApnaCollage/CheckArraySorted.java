class CheckArraySorted{
    public static void main(String[] args){
        int[] arr = {1,2,3,2,5};
        if(sorted(arr,1)){
            System.out.print("Sorted");
        }else{
            System.out.print("Not Sorted");
        }
    }

    public static boolean sorted(int[] arr, int i){
        if(i==arr.length){
            return true;
        }
        if(arr[i]>=arr[i-1]){
            return sorted(arr, i + 1);
        }else{
            return false;
        }
        
        
    }
}