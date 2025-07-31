import java.util.*;
class AccessingList{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n>0){
            int input = in.nextInt();
            arr.add(input);
            n--;
        }

        Arrays.asList(arr).forEach(element -> System.out.print(element + " "));
    }
}