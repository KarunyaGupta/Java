import java.util.*;

class RemoveNthNodeFromEnd {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0; // Initialize size to 0

    public static void addElement(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public static int removeElement() {
        if (size == 0) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void printList() {
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> null");
    }

    public static void deleteNthFromEnd(int n) {
        if (head == null || n <= 0 || n > size) {
            System.out.println("Invalid n value");
            return; // Handle edge cases
        }

        // If n is equal to the size, remove the head
        if (n == size) {
            head = head.next; // Remove the first node
            size--;
            return;
        }

        Node prev = head;
        int idxToFind = size - n;
        for (int i = 1; i < idxToFind; i++) {
            prev = prev.next;
        }

        // Remove the nth node from the end
        if (prev.next != null) {
            prev.next = prev.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        addElement(10);
        addElement(20);
        addElement(30);
        printList(); // Should print: 30 -> 20 -> 10 -> null
        removeElement(); // Removes the head (30)
        printList(); // Should print: 20 -> 10 -> null
        System.out.println("Size: " + size); // Should print: Size: 2
        deleteNthFromEnd(1); // Deletes the last element (10)
        printList(); // Should print: 20 -> null
        System.out.println("Size: " + size); // Should print: Size: 1
    }
}