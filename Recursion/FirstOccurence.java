class FirstOccurence{
    public static void main(String[] args){
        int[] arr = {3,2,3,5,6,2,8,9,1};
        int key = 3;
        System.out.print(firstOccurence(arr,key,arr.length));
    }
    public static int firstOccurence(int arr[] , int key , int i){
        if(i<0){
            return -1;
        }
        int isFound = firstOccurence(arr,key,i-1);
        if(isFound == -1&& arr[i]==key){
            return i;
        }
        return isFound;
    }
}