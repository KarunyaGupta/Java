import java.util.*;
class Maximum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        
       ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<10;i++){
            int temp = in.nextInt();
            list.add(temp);
        }

        for(int i=0;i<10;i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.print(max);

    }
}