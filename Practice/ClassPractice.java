import java.util.*;
class ClassPractice{
    public static void main(String[] args){
        int[] arr = {12,7,-5,9,20,-3,15,8};


        // sorting
        sorting(arr);
        System.out.println("Array : " + Arrays.toString(arr));
        int[] reverseArray = reverse(arr);
        System.out.println("Reverse Array : " + Arrays.toString(reverseArray));

        int positive = countPos(arr);
        int negative = countNeg(arr);
        System.out.println("Positive: " + positive +"\n" + "Negative: "+ negative);



        ArrayList<Integer> list = evenArray(arr);
        System.out.println("Even Element: " + list);


        int secondMax = secLargest(arr);
        System.out.println("Second Largest: " +secondMax);
        int secSmallest = secondSmallest(arr);
        System.out.println("Second Samllest: " + secSmallest);

        
    }

// sorting using counting sort
    public static void sorting(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0&& current<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
    }


    // reverse an array;
    public static int[] reverse(int[] arr){
        int[] rev = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[i] = arr[arr.length-i-1];
        }
        return rev;
    }

    // pos count 
    public static int countPos(int[] arr){
        int countpos = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                countpos++;
            }
        }
        return countpos;
    }
    // neg tcount 
    public static int countNeg(int[] arr){
        int countneg = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                countneg++;
            }
        }
        return countneg;

    }
    // even element 
    public static ArrayList<Integer> evenArray(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2==0){
                list.add(arr[i]);
            }
        }
        return list;
    }

    // second largest
    public static int secLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secMax && arr[i]<max){
                secMax = arr[i];
            }
        }
        return secMax;
    }


    // second smallest
    public static int secondSmallest(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int secMin = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<secMin && arr[i]>min){
                secMin = arr[i];
            }
        }
        return secMin;
    }
}