import java.util.*;
class Uniqueahah{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        System.out.println("Enter numbers (-999 to stop):");
        
        while(true){
            int n = in.nextInt();
            
            if(n == -999){
                break;
            }
            if(n > 0){
                positiveCount++;
            }else if(n < 0){
                negativeCount++;
            }else{
                zeroCount++;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
        
        in.close();
    }
}

