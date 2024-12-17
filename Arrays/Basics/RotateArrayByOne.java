class RotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Original array: ");
        printArray(arr);
        rotateArrayByOne(arr);
        System.out.print("Rotated Array: ");
        printArray(arr);
        // rotate(arr);

    }

    public static void rotateArrayByOne(int[] arr) {
        if (arr.length == 0) {
            return; 
        }
        
        int lastElement = arr[arr.length - 1]; 
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = lastElement; 
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }
}