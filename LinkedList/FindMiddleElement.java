class FindMiddleElement{
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;


    public  void addElementFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }
        newNode.next = head;
        head = newNode;

        size ++;
    }
    public  void addElementLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            // return;
        }
        tail.next = newNode;
        tail = newNode;

        size++;
    }


    public static int printList(){
        if(head == null){
            System.out.println("Linkedlist is Empty");
            return -1;
        }
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        return 0;
    }

    public static void findMiddle(){
        if(head == null){
            System.out.println("Linkedlist is Empty");
            return;
        }
        Node slow = head;
        Node fast = head;
        while(fast!= null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle Element is: " + slow.data);
    }


    public static void main(String[] args){
        FindMiddleElement ll = new FindMiddleElement();
        ll.addElementFirst(20);
        ll.addElementFirst(30);
        ll.addElementLast(40);
        ll.addElementLast(50);
        ll.addElementLast(60);
        ll.addElementLast(70);
        ll.addElementFirst(10);
        ll.printList();
        ll.findMiddle();
    }
}