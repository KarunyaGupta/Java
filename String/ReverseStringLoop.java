public class ReverseStringLoop {
    public static void main(String[] args) {
        String original = "Karunya Gupta";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}