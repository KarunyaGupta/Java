import java.util.*;
// best question 
// iterative approach
class ReverseLinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static Node head;
    public static Node tail;


    public static void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void printList(){
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        
    }

    public static void main(String[] args){
        addElement(10);
        addElement(20);
        addElement(30);
        addElement(40);
        printList();
        reverse();
        printList();
    }
}