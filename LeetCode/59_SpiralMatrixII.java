class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        // ArrayList<Integer> res = new ArrayList<>();
        int c = 1;
        while(c<= n*n){
            //upper
            for(int i =left;i<=right;i++){
                matrix[top][i] = c;
                c++;
            }
            top++;
            //right
             for(int i =top;i<=bottom;i++){
                matrix[i][right] = c;
                c++;
            }
            right--;
            //bottom
            if(top<=bottom){
                 for(int i =right;i>=left;i--){
                matrix[bottom][i] =c ;
                c++;
            }
            bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    matrix[i][left]=c;
                    c++;
                }
                left++;
            }

        }
        return matrix;
    }
}