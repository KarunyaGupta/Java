class FriendProblem{
    public static void main(String[] args){
        System.out.print(friendsParing(10));
    }
    public static int friendsParing(int n){
        if(n==1|| n==2){
            return n;
        }

        return friendsParing(n-1) + (n-1) * friendsParing(n-2);
    }
}