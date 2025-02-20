import java.util.*;
class Search{
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



    public static void addElement(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public static void addElementLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void printList(){
        Node temp = head;
        if(head==null){
            System.out.print("Empty");
        }
        while(temp != null){
            System.out.print(temp.data);
            temp = temp.next;
            if(temp != null){
                System.out.print("->");
            }
        }
        System.out.println();
    }



    // searching
    public static int search(int target) {
        Node temp = head;
        int index = 0; 
        while (temp != null) {
            if (temp.data == target) {
                return index; 
            }
            temp = temp.next; 
            index++;
        }
        return -1; 
    }

    public static int searchRecursion(int target , Node head){
        // Node newNode = new Node(data);
        if(head == null){
            // head = tail = newNode;
            return -1;
        }
        if(head.data == target){
            return 0;
        }
        int idx = searchRecursion(target , head.next);
        if(idx == -1){
            return -1;
        }

        return idx+1;
    }

    public static void main(String[] args){
        addElement(1);
        addElement(2);
        addElementLast(3);
        addElementLast(4);
        addElement(5);
        addElement(10);
        printList();

        Scanner in  = new Scanner(System.in);
        int target = in.nextInt();
        int isFound = search(target);
        if(isFound == -1){
            System.out.println("No element found");
        }else{
            System.out.println(isFound);
        }

        int recRes = searchRecursion( target, head);
        System.out.println(recRes);
    }
}