class PrintNumber1ToN{
    public static void main(String[] args){
        int n = 1;
        int range = 10;
        IncNum(n,range);



        int numInc= 10;
        inc(numInc);

    }
    public static void IncNum(int n,int range){
        if(n>range){
            return ;
        }
        System.out.print(n + " ");
        IncNum(n+1,range);
    }

    public static void inc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        inc(n-1);
        System.out.print(n +" ");
    }
}
