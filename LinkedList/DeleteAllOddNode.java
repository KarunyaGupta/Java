class DeleteAllOddNode{
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

    public static void addFirst(int data){
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
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void deleteOdd(){
        // Handle case where head is null
        if(head == null) return;
        
        // Handle case where head has odd value
        while(head != null && head.data % 2 != 0) {
            head = head.next;
        }
        
        // Delete odd nodes
        Node current = head;
        while(current != null && current.next != null) {
            if(current.next.data % 2 != 0) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public static void main(String[] args){
        DeleteAllOddNode ll = new DeleteAllOddNode();
        ll.addFirst(5);  // odd
        ll.addFirst(4);  // even
        ll.addFirst(3);  // odd
        ll.addFirst(2);  // even
        ll.addFirst(1);  // odd
        
        System.out.println("Original List:");
        ll.printList();
        
        ll.deleteOdd();
        
        System.out.println("After deleting odd nodes:");
        ll.printList();
    }
}