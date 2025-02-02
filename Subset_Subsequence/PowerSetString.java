import java.util.*;

class PowerSetString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subsets(str));
    }

    public static List<String> subsets(String str) {
        List<String> result = new ArrayList<>();
        int n = str.length();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder subset = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.append(str.charAt(j));
                }
            }
            result.add(subset.toString());
        }
        return result;
    }
}