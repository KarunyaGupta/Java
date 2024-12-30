import java.util.*;

class StringPalindrome {
    public static void main(String[] args) {
        StringBuilder original = new StringBuilder();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        original.append(str);

        StringBuilder reverse = new StringBuilder(original).reverse(); 

        // Compare the contents of original and reverse
        if (original.toString().equals(reverse.toString())) {
            System.out.print("Yes, it's a Palindrome");
        } else {
            System.out.print("No, it's not a Palindrome");
        }
    }
}