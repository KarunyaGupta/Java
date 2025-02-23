public class BubbleSortReverse {
    public static void main(String[] args) {
        // Input strings
        String[] strings = {"mango", "orange","banana","grapes"};

        // Sort the strings in reverse alphabetical order
        bubbleSortReverse(strings);

        // Print the sorted array
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }

    public static void bubbleSortReverse(String[] arr) {
        int n = arr.length;
        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Last i elements are already sorted
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (arr[j].compareTo(arr[j + 1]) < 0) { // Change to > for reverse order
                    // Swap if they are in the wrong order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}