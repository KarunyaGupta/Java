class LinkedListOperations{
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

    public static void addElement(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            // return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        
    }
     

    public static void printList(){
        Node temp = head;
        if(head==null){
            System.out.println("EMPTY");
            return;
        }
        while(temp!= null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp!= null){
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static int removeElement(){
        // remove first
        if(size==0){
            System.out.println("EMPTY HAI BHAI");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static int search(int target){
        Node temp = head;
        int idx = 0;
        while(temp!= null){
            if(temp.data == target){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public static void main(String[] args){
        addElement(10);
        printList();
        addElement(20);
        printList();
        addElement(30);
        printList();
        addElement(40);
        printList();
        removeElement();
        printList();
        System.out.println(size);
        System.out.println(search(100));
    }
}