public class PrintNaturalNumbers {

    // Recursive method to print first n natural numbers
    public static void printNaturalNumbers(int n) {
        if (n <= 0) {
            return;
        }
        printNaturalNumbers(n-1);
        
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        
        int n =10;
        
        printNaturalNumbers(n);
    }
}