import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "KarunyaGupta"; // no space
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[26]; // For lowercase letters only
        removeDuplicates(str.toLowerCase(), 0, sb, check); // Convert to lowercase
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr); // Print the result when done
            return; // Ensure to return after printing
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']== true) {
            // If the character is already included, skip it
            removeDuplicates(str, idx + 1, newStr, map);
        } else {
            // If the character is not included, add it to the result
            map[currChar - 'a'] = true;
            newStr.append(currChar);
            removeDuplicates(str, idx + 1, newStr, map);
            newStr.deleteCharAt(newStr.length() - 1);
        }
    }
}