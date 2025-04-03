import java.util.*;

class StackArrayList {
    private static ArrayList<Integer> list = new ArrayList<>();
    private static int top = -1;
    private static Scanner in = new Scanner(System.in);
    
    public statc class Stack {
        public static void push(int data) {
            // Instead of checking for overflow, we just add the data
            top++;
            list.add(data);
            System.out.println("Pushed: " + data);
        }

        public static void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
            } else {
                System.out.println("Element removed: " + list.get(top));
                list.remove(top); // Remove the element from the list
                top--;
            }
        }

        public static void print() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.print();
        st.push(40);
        st.print();
        st.push(100);
        st.print();
        st.push(500);
        st.print();
        st.pop();
        st.print(); // Print after popping to see the current stack
    }
}