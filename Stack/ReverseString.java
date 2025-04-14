import java.util.Stack;
class ReverseString{
    public static void main(String[] args){
        String str = "Karunya Gupta";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }

        System.out.println(reversed.toString());
    }
}