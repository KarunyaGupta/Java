import java.util.*;
class Stack{
    private static ArrayList <Integer> list = new ArrayList<>();
    private static int top = -1;
    private static Scanner in = new Scanner(System.in);
    public static void push(int data){
        top++;
        list.add(data);
        System.out.println("Data pushed : " + data);
        return;
    }
    public static void pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow");
            return;
        }
        System.out.println("Element removed : "+list.get(top));
        list.remove(top);
        return;
    }
    public static void printlist(){
        for(int i = top ;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

class StackArrayList{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack st = new Stack();
        int choice = 0;
        while(choice != 4){
            System.out.println("Stack operation:");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. print");
            System.out.println("4. exit");
            System.out.println("Enter your choice : ");
            choice = in.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter data to print : ");
                    int data = in.nextInt();
                    st.push(data);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.printlist();
                    break;
                case 4:
                    System.out.println("Exiting....");
                    break;
                default: 
                    System.out.println("Invalid choice");
            }

        }
    }
}