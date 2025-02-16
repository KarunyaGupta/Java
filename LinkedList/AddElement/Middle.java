class Middle {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; // Changed to instance variable
    public Node tail; // Changed to instance variable

    public void addMiddle(int idx, int data) { // Changed to non-static method
        Node newNode = new Node(data);
        
        // If adding at the head (index 0)
        if (idx == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) { // If the list was empty, set tail
                tail = newNode;
            }
            return;
        }

        Node temp = head;
        int i = 0;

        // Traverse to the node just before the desired index
        while (temp != null && i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // If temp is null, the index is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // If we added at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public void printList() { // Changed to non-static method
        Node temp = head;
        while (temp != null) { // Use temp instead of head
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Middle ll = new Middle();
        ll.addMiddle(0, 4); // Adding at index 0
        ll.addMiddle(1, 5); // Adding at index 1
        ll.addMiddle(1, 6); // Adding at index 1
        ll.printList(); // Should print: 4 -> 6 -> 5 -> null
    }
}