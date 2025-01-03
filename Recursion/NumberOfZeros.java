class NumberOfZeros {
    public static void main(String[] args) {
        int n = 1002;
        int count = numberOfZeros(n);
        System.out.print(count);
    }

    public static int numberOfZeros(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 10) {
            return n == 0 ? 1 : 0;
        }
        int rem = n % 10;
        return (rem == 0 ? 1 : 0) + numberOfZeros(n / 10);
    }
}