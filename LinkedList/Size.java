class Size{
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

    static int count ;
    

    public static void addElementFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addElementLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        
    }

    public static void printList(){
        Node temp = head;
        if(head == null){
            System.out.println("Empty");
            return;
        }
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static int sizeOfLinkedList(){
        Node temp = head;
        if(head == null){
            return count;
        }
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        Size ll = new Size();
        ll.printList();

        // add elements in last 
        ll.addElementLast(2);
        ll.addElementLast(1);

        // add elements in starting
        ll.addElementFirst(4);
        ll.addElementFirst(5);
        ll.printList();

        int size = ll.sizeOfLinkedList();
        System.out.println("Size of LinkedList is : " + size);
    }
}