import java.util.*;

interface Addition{
    int add(int a, int b);
}

interface Multiplication{
    int multiply(int c, int d);
}

public class LambdaParameter2 {
    public static void main(String[] args) {
        Addition addition = (a, b) -> a + b;
        int result = addition.add(5, 10);
        System.out.println("The sum is: " + result);
        
        Multiplication multiplication = (c, d) -> c * d;
        int product = multiplication.multiply(5, 10);
        System.out.println("The product is: " + product);
    }
}