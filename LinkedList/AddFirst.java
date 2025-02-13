// create a new node
// new node's next = head
// head = new Node;
class AddFirst{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail= newNode;
            return;
        }
        
        // step 2 --> newNode next = head;
        newNode.next = head;
        // step 3 --> head = new node;
        head = newNode;
    }


    public static void main(String[] args){
        AddFirst ll = new AddFirst();
        ll.addFirst(1);
        ll.addFirst(2);
    }
}