import java.util.ArrayList;

public class PushElement {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Add elements to the ArrayList
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");

        // Add a new element
        myList.add(1,"date"); // in a praticular index

        // Output the updated ArrayList
        System.out.println(myList); // [apple, banana, cherry, date]
    }
}