class ElementExist{
    public static void main(String[] args){
        int number = 100;
        int[] arr = {1,2,3,4,5,6,77,8,9,0,10};
        System.out.println(exist(arr,number));

    }
    public static int exist(int[] arr , int number){
        // boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== number ){
                // flag = true;
                return i;
            }
        }
        return -1;
    }
}