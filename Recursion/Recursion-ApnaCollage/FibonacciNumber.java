class FibonacciNumber {

    // nth Fibonacci number
    public static void main(String[] args) {
        int n = 10; 
        int res = fibonacciNumber(n);
        System.out.print(res);
    }

    public static int fibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }
}