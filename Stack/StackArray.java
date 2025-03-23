import java.util.*;

class Stack {
    private int top = -1;
    private int n = 10;
    private int[] a = new int[n];
    private Scanner in = new Scanner(System.in);

    void push() {
        if(top == n-1) {
            System.out.println("Overflow - Stack is full");
        } else {
            System.out.print("Enter element: ");
            int i = in.nextInt();
            top++;
            a[top] = i;
            System.out.println("Item inserted");
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Underflow - Stack is empty");
        } else {
            System.out.println("Deleted item: " + a[top]);
            top--;
        }
    }

    void display() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Items are: ");
        for(int i = top; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

public class StackArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack s = new Stack();
        int choice = 0;
        
        while(choice != 4) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = in.nextInt();
            
            switch(choice) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4");
            }
        }
        in.close();
    }
}