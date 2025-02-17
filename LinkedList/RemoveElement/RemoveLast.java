class RemoveLast{
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

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode; 
        }
        
        size++;
    }

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        
        size++;
        
    }

    public static void printList(){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static int removeFirst(){
        if(size==0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public static int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // logic
        Node current = head;
        while (current.next != tail) {
            current = current.next;
        }
        int val = tail.data;
        tail = current;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args){
        addFirst(10);
        addLast(20);
        addLast(30);
        addFirst(0);
        printList();
        System.out.println(size);
        removeFirst();
        printList();
        System.out.println(size);
        removeLast();
        printList();
        System.out.println(size);
    }


}