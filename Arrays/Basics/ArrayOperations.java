import java.util.*;
class ArrayOperations {
    public static void main(String[] args) {

        int[] arr = new int[10];
        System.out.println("Insertion");
        insertion(arr);
        System.out.println("Deletion");
        delete(arr,5);
        System.out.println("Triverse");
        arrayTriversal(arr);
        System.out.println("Searching");
        searching(arr,3);
        System.out.println("Sorting");
        sorting(arr);
        System.out.println("Sum");
        System.out.println(sum(arr));
        System.out.println("avg");
        System.out.println(avg(arr));


        int[] res = transformation(arr);
        System.out.println("Transformation");
        System.out.println(Arrays.toString(res));

        int[] arr2 = {1,2,3,4,5};
        System.out.println("Merged Array");
        System.out.println(Arrays.toString(merge(arr,arr2)));




        int[][] twoDArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 9, 8}
        };
        int[] oneDArray = convert2DTo1D(twoDArray);

        System.out.println("1D Array from 2D Array: ");
        System.out.println(Arrays.toString(oneDArray));

        
    }
// insertion
    public static void insertion(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }
// deletion
    public static void delete(int[] arr , int  target){
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
//triversal
    public static void arrayTriversal(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
//searching
    public static void searching(int[] arr , int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                System.out.println(i);
            }
        }
    }
//sorting
    public static void sorting(int[] arr){
       for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
//sum
    public static int sum(int[] arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
    
    public static double avg(int[] arr){
        int sum = sum(arr);
        double avg =(double) sum / arr.length; 
        return avg;
    }

    public static int[] transformation(int[] arr){
        int[] square = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            square[i] = arr[i]*arr[i];
            
        }
        return square;
    }

    public static int[] merge(int[] arr, int[] arr2) {
        int[] mergedArray = new int[arr.length + arr2.length];
        for (int i = 0; i < arr.length; i++) {
            mergedArray[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[arr.length + i] = arr2[i]; // Correctly index into mergedArray
        }
        sorting(mergedArray);

        return mergedArray;
    }


    // Reshaping
    public static int[] convert2DTo1D(int[][] twoDArray) {
        int totalElements = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            totalElements += twoDArray[i].length;
        }

        int[] oneDArray = new int[totalElements];

        int index = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        return oneDArray;
    }
    
    
}