import java.util.Stack;

class ReverseString {
    String str = "Karunya Gupta";

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        // Push all characters onto stack
        for(char c : str.toCharArray()) {
            s.push(c);
        }

        // Pop all characters to create reversed string
        while(!s.isEmpty()) {
            reversed.append(s.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String result = reverse(rs.str);
        System.out.println("Original string: " + rs.str);
        System.out.println("Reversed string: " + result);
    }
}