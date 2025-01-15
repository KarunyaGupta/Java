class PrintNumberNto1{
    public static void main(String[] args){
        int n = 10;
        decNum(n);
    }
    public static void decNum(int n){
        if(n<=0){
            return ;
        }
        System.out.print(n + " ");
        decNum(n-1);
    }
}