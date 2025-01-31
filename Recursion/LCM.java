class LCM{
    public static void main(String[] args){
        int x = 242;
        int y = 984;
        System.out.print(lcm(x,y));
    }
    public static int gcd(int x , int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    public static int lcm(int x , int y){
        return (x * y) / gcd(x, y);
    }
}