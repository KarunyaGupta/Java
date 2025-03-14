import java.util.*;
class PovitElementArrayArrange{
    public static void main(String[] args){
        int[] arr = new int[10];
        int povit = 3;
        input(arr);
        List<Integer> arraged = new ArrayList<>();


        for(int i=0;i<arr.length;i++){
            if(arr[i]< povit){
                arraged.add(arr[i]);
            }
            if(arr[i] == povit){
                arraged.add(arr[i]);
            }
        }
        System.out.println(arraged.toString());

    }

    public static void input(int arr[]){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
    }
}// very inmportant question