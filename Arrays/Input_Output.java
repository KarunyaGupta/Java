import java.util.*;
public class Input_Output{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] arr = new String[5];
        arr[0] = "Hello";
        arr[1] = "My";
        arr[2] = "Name";
        arr[3] = "is";
        arr[4] = "Karunya";
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); // output
        }

        // for(int i=0;i<arr.length;i++){
        //     arr[i] = in.nextLine(); // input
        // }

        // for eachloop 

        for(String data : arr){
            System.out.print(data +" ");
        }

        System.out.println("");
        System.out.print(Arrays.toString(arr)); // print the array

    }
}