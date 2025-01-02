class IdxOfGivenElement{
    public static void main(String[] args){
        int[] arr = {1,2,3,1,2,1,2,1};
        int num = 1;
        exist(num , 0 , arr);// 0 is an initial index;
    }
    public static void exist(int num , int i,int[] arr){
        if(i==arr.length){
            return;
        }else{
            if(num==arr[i]){
                System.out.print(i+" ");
            }
        }
        exist(num , i+1,arr);
    }
}