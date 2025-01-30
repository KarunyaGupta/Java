// Write a Java program to perform the following operations on a 2D array (matrix): 
// 1. Create a 2D array of integers with user-defined rows and columns. Populate it with user 
// input. 
// 2. Print the transpose of the matrix. 
// 3. Check if the matrix is a symmetric matrix (i.e., it is equal to its transpose). 
// 4. Calculate and print the sum of all elements in the matrix. 
// 5. Find the maximum and minimum values in the matrix and their respective positions.

import java.util.*;

class ClassPractice2{
    public static void main(String[] args){


        int[][] matrix = new int[3][3];
        input(matrix);
        System.out.println("\n Real of Matrix: \n");
        printMatrix(matrix);

        int[][] transpostOfMatrix = transpose(matrix);
        System.out.println("\nTranspose of Matrix: \n");
        printMatrix(transpostOfMatrix);

        boolean sym = isSymmetric(matrix,transpostOfMatrix);
        System.out.println("Is Symmertic : " + sym);


        int[] matrixRowSum = rowSum(matrix);
        System.out.println("Sum of rows of matrix : " + Arrays.toString(matrixRowSum)); 


        // minimum and maximum value
        int[] minMax = maxMin(matrix);
        System.out.println("Minimum and Maximum value: " + Arrays.toString(minMax));

    }

    public static void input(int[][] matrix){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            System.out.print("Enter Row " + (i+1) + ": ");
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = in.nextInt();
            }
        }
    }
    public static void printMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    // transpose of matrix
    public static int[][] transpose(int[][] matrix){
        int[][] trans = new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }


    // symmetric Matrix

    public static boolean isSymmetric(int[][] matrix , int[][] trans){
        boolean flag = true;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] != trans[i][j]){
                    return false;
                }
            }
        }
        return true;
    }


    // sum of all the elements
    public static int[] rowSum(int[][] matrix){
        int[] rSum = new int[matrix.length];
        
        for(int i=0;i<matrix.length;i++){
            int sum = 0;
            for(int j=0;j<matrix.length;j++){
                sum+= matrix[j][i];
            }
            rSum[i] = sum;
        }
        return rSum;
    }

    // minimum and maximum value of matrix 
    public static int[] maxMin(int[][] matrix){
        int[] res = new int[2];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // min value
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]<min){
                    min = matrix[i][j];
                }
            }
        }

        // max Value
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }

        res[0] = min;
        res[1] = max;


        return res;
    }
}