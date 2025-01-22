class MethodOverLoading{
    public static void main(String[] args){
        int ans = sum(1,2);
        int ans2 = sum(1,2,3);
        System.out.println(ans);
        System.out.println(ans2);


        double ans3 = sum(1.1,2.3,22.4);
        System.out.println(ans3);
    }
    // same function name but different parameters 
    public static int sum (int a , int b){
        int sum = a + b;
        return sum;
    }
    public static int sum (int a , int b , int c){
        int sum = a + b+c;
        return sum;
    }
    public static double sum (double a , double b,double c){
        double sum = a + b + c;
        return sum;
    }
}