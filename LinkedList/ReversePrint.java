class ReversePrint{
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
    public static int size;

    public static void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public static int removeElementFirst(){
        if(size==0){
            System.out.print("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size++;
        return val;
    }

    

    public static void printList(){
        if(head == null){
            System.out.print("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp!=null){
                System.out.print("-");
            }
        }
        System.out.println();
    }

    public static void reversePrint(Node head){
        if(head == null){
            return;
        }
        reversePrint(head.next);
        System.out.print(head.data+"-");
    }

    public static void main(String[] args){
        addElement(1);
        addElement(2);
        addElement(3);
        System.out.println(size);
        printList();

        removeElementFirst();
        printList();
        reversePrint(head);
    }
}