class LinearSearch{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,2,4,5,2,1,2,5,2,1};
        int target = 2;
        // ArrayList<Integer> res = new ArrayList<>();
        searchTarget(0,target,arr);
    }
    public static void searchTarget(int i, int target , int[] arr){
        if(i==arr.length){
            return;
        }
        if(arr[i]==target){
            System.out.print(i+" ");
        }
        // if(arr[i]!=target){
            
        // }
        searchTarget(i+1,target,arr);
    }
}