import java.util.*;


class MaxValue{
    public static void main(String[] args){
        int[] arr = {1,2,4,2,2,1,77,6};
        System.out.print(findMax(arr,0,arr.length-1));

    }

    public static int findMax(int[] a, int head, int last) {

        int max = 0;
        if (head == last) {
            return a[head];
        } else if (a[head] < a[last]) {
            return findMax(a, head + 1, last);
        } else {
            return a[head];
        }
    }


}