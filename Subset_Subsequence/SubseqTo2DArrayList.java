import java.util.*;

public class SubseqTo2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> subsequencesList = new ArrayList<>();
        ArrayList<String> subsequences = new ArrayList<>();
        
        // Generate subsequences
        generateSubsequences("", "abc", subsequences);
        
        // Add each subsequence to the 2D ArrayList
        for (String subseq : subsequences) {
            ArrayList<String> row = new ArrayList<>();
            row.add(subseq);
            subsequencesList.add(row);
        }

        // Print the 2D ArrayList
        System.out.print(subsequencesList);
    }

    static void generateSubsequences(String p, String up, ArrayList<String> list) {
        // p = processed, up = unprocessed
        if (up.isEmpty()) {
            list.add(p); // Add the current subsequence to the list
            return;
        }
        char ch = up.charAt(0);
        generateSubsequences(p, up.substring(1), list); // Ignore the current character
        generateSubsequences(p + ch, up.substring(1), list); // Include the current character
    }
}