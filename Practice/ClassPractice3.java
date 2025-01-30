// Create an array of integers using user input. 
// 2. Separate the array into two arrays: 
// ○ One containing odd numbers. 
// ○ The other contains even numbers. 
// 3. Sort both the odd and even arrays in ascending order. 
// 4. Merge the sorted odd and even arrays back into a single array where odd numbers 
// come first, followed by even numbers. 
// // 5. Print the final merged array.

import java.util.*;
class ClassPractice3{
    public static void main(String[] args){
        int[] arr = new int[4];
        userInput(arr);
        printArray(arr);

        // int[] even = new int[4];
        ArrayList<Integer> even = new ArrayList<>();
        // int[] odd = new int[4];
        ArrayList<Integer> odd = new ArrayList<>();
        seprateLogic(arr,even,odd);
        System.out.println(even);
        System.out.println(odd);
    }

    public static void userInput(int[] arr){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter elements of array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }


    public static void seprateLogic(int[] arr,ArrayList<Integer> even,ArrayList<Integer>odd){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            } 
        }
    }
}