class BasicCode{
    public static void main(String[] args){
        int n = 5;
        int res = factorial(n);
        System.out.print(res);
    }

    // factorial of an array
    public static int factorial(int x){
        // base case 
        if(x==0){
            return 1;
        }
        if(x<0){
            return -1;
        }
        return x*factorial(x-1);
    }
}