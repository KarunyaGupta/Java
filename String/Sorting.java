import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        String inputString = "Karunya";
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println(sortedString);
    }
}