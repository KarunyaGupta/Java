class SquareRecursion{
    public static void main(String[] args){
        int n = 5;
        recursion(n);
    }
    public static void recursion(int n){
        if(n==0){
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        recursion(n-1);
    }
}