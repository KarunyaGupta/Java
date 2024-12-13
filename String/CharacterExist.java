import java.util.*;

class CharacterExist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String name = in.nextLine();
        System.out.print("Enter a character to find: ");
        String find = in.nextLine();

        // Ensure that the user enters only one character
        if (find.length() != 1) {
            System.out.println("Please enter exactly one character.");
            return;
        }

        int res = toFind(name, find.charAt(0));
        System.out.print(res);
    }

    public static int toFind(String name, char find) {
        for (int i = 0; i < name.length(); i++) {
            if (find == name.charAt(i)) {
                return i; // Return the index of the first occurrence
            }
        }
        return -1; // Return -1 if the character is not found
    }
}