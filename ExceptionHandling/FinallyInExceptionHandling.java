import java.util.*;

class ArithmeticException extends Exception {
    public ArithmeticException(String message) {
        super(message);
    }
}

class IndexOutOfBound extends Exception {
    public IndexOutOfBound(String message) {
        super(message);
    }
}

class FinallyInExceptionHandling{
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an index (0-9): ");
        int number = in.nextInt();

        try {
            // Check for division by zero first
            if (number == 0) {
                throw new ArithmeticException("Number cannot be zero for division.");
            }

            // Check for index out of bounds
            if (number >= arr.length) {
                throw new IndexOutOfBound("Array index out of bounds.");
            }

            // Access the array and perform division
            System.out.println("Array value at index " + number + ": " + arr[number]);
            int res = 100 / number;
            System.out.println("Result of division: " + res);

        } catch (IndexOutOfBound | ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }finally{
            System.out.println("This is a Finally Block");
        }
    }
}
