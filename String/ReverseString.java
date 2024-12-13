public class ReverseString {
    public static void main(String[] args) {
        String original = "Karunya Gupta";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}