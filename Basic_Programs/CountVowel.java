import java.util.*;

class CountVowel {
    public static void main(String[] args) {
        String str = "Karunya Gupta";
        int count = 0;

        String toLower = str.toLowerCase();
        for (int i = 0; i < toLower.length(); i++) {
            char ch = toLower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.print("vowels: " + count);
    }
}