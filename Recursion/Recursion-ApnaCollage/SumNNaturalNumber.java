class SumNNaturalNumber{
    public static void main(String[] args){
        int n = 10;
        int res = sum(n);
        System.out.print(res);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }

        return n + sum(n-1);
    }
}