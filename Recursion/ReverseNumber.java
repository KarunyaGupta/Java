class ReverseNumber{
    public static void main(String[] args){
        int n = 321;
        reverseNumber(n);
    }

    public static void reverseNumber(int n){
        if(n<=0){
            return;
        }
        int rem = n%10;
        System.out.print(rem);
        reverseNumber(n/10);
    }
}