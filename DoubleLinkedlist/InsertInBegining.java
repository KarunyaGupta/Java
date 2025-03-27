class Node {
    Node prev;
    int data;
    Node next;
}

public class InsertInBegining {
    Node head = null;
    
    public void insertFront(int val) {
        Node newNode = new Node();
        newNode.data = val;
        newNode.next = null;
        newNode.prev = null;
        
        if(head == null) {.l,
            head = newNode;
        } else {
            // head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void printList() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        System.out.print("List: ");
        while(temp != null) {
            System.out.print(temp.data);
            if(temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        InsertInBegining dll = new InsertInBegining();
        
        // Test case 1: Insert into empty list
        dll.insertFront(10);
        System.out.println("After inserting 10:");
        dll.printList();
        
        // Test case 2: Insert at beginning
        dll.insertFront(20);
        System.out.println("After inserting 20:");
        dll.printList();
        
        // Test case 3: Insert another element
        dll.insertFront(30);
        System.out.println("After inserting 30:");
        dll.printList();
    }
}