import java.util.Scanner;

// Node class to represent each product in the linked list
class Node {
    String product;
    double price;
    Node next;

    Node(String product, double price) {
        this.product = product;
        this.price = price;
        this.next = null;
    }
}

// LinkedList class to manage the linked list
class LinkedList {
    Node head;

    // Method to add a new product to the linked list
    public void add(String product, double price) {
        Node newNode = new Node(product, price);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to display the products and their prices
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.println("Product List:");
        while (current != null) {
            System.out.println("Product: " + current.product + ", Price: $" + current.price);
            current = current.next;
        }
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList productList = new LinkedList();

        System.out.println("Enter the number of products you want to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Enter product name:");
            String product = scanner.nextLine();
            System.out.println("Enter product price:");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            productList.add(product, price);
        }

        // Display the list of products
        productList.display();

        scanner.close();
    }
}