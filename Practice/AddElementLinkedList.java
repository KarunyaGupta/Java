import java.util.*;
class AddElementLinkedList{
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void addElement(int element){
        Node newNode = new Node(element);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public static void addElementLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        tail.next = newNode;
        tail= newNode;
        size++;
    }

    public static void addElementMiddle(int index , int data){

        
        Node newNode = new Node(data);

    // If adding at index 0
        if (index == 0) {
            if (head == null) {
                head = tail = newNode; // List is empty
            } else {
                newNode.next = head; // New node points to the current head
                head = newNode; // Update head to the new node
            }
            return;
        }

        // Check if index is out of bounds
        Node temp = head;
        int i = 0;
        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // If temp is null, index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;

        // If we inserted at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public static void printElement(){
        if(head == null){
            return;
        }
        while(head != null){
            System.out.print(head.data + "-");
            head = head.next;
        }
        System.out.println();
    }

    public static int removeElementFirst(){
        // if(size)
        if(size == 0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        else{
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
    }

    public static void main(String[] args){
        addElement(20);
        addElement(30);
        addElementLast(30);
        addElement(100);
        printElement();
        removeElementFirst();
        printElement();
        // addElementMiddle(100, 1);
        // printElement();

        // System.out.println(size);
    }
}