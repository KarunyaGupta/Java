class ArraySorted{
    public static void main(String[] args){
        int[] arr = {1,1,4,5};
        System.out.print(isSorted(arr,0));
    }

    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i] >arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }
}