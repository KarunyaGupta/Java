class LastOccurence{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6,7,8,9,1};
        int key = 1;
        System.out.print(lastOccurance(arr,key,0));
    }
    public static int lastOccurance(int arr[] , int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr,key,i+1);
        if(isFound == -1&& arr[i]==key){
            return i;
        }
        return isFound;
    }
}