import java.util.*;
class LinkedList{
    public static class Node{
        int data;
        Node next; // reference variable to next variable

        public Node(int data){ // constructor
            this.data = data;
            this.next = null;
        }

        
    }

    // head and tail 
    public static Node head;
    public static Node tail;


    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.head = new Node(1); // data
        ll.head.next = new Node(2); // next

    }
    
}