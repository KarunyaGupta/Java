class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    private static Node head;
    private static Node tail;

    public static void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }else{
            newNode.next = head;
            head = newNode;
        }
        
    }
    public static int pop(){
        int res;
        if(head == null){
            System.out.print("LL is empty");
            return Integer.MIN_VALUE;
        }else{
            res = head.data;
            head = head.next;
        }
        return res;
    }

    public static void print(){
        Node temp = head;
        if(head == null){
            return;
        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}

class StackLinkedList{
    public static void main(String[] args){
        Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.print();
        st.pop();
        st.print();
        
    }
}