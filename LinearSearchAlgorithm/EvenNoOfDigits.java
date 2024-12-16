class EvenNoOfDigits{
    public static void main(String[] args){

    }
    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            int rem = num /10;
            
        }
    }
}