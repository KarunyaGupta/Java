import java.util.*;

class SwapTwoNumbers {
    public static void main(String[] args) {
        // Take input of two numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number (x): ");
        int x = in.nextInt();
        System.out.print("Enter second number (y): ");
        int y = in.nextInt();

        // Swap using the first method
        int[] swapped = swap(x, y);
        System.out.println("After swap method 1: x = " + swapped[0] + ", y = " + swapped[1]);

        // Swap using the second method
        int[] swapped2 = swap2(x, y);
        System.out.println("After swap method 2: x = " + swapped2[0] + ", y = " + swapped2[1]);
    }

    static int[] swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        return new int[]{a, b}; // Return the swapped values as an array
    }

    static int[] swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a, b}; // Return the swapped values as an array
    }

    
}