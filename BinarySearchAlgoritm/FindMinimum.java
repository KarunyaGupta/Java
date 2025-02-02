class FindMinimum{
    public static void main(String[] args){
        int[] a = {3,4,5,5,1,2};
        System.out.print(findMunimum(a));
    }
    static int findMunimum(int[] a){
        int start = 0;
        int n = a.length;
        int end = n-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(a[mid]<=a[n-1]){
                ans = mid;
                end = mid-1;
            }else{
                start = mid +1;
            }
        }
        return ans;
    }
}