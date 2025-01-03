import java.util.*;
class NumberToWord{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String str = Integer.toString(num);
        numberToString(str,0);
        
    }

    public static void numberToString(String str , int i){
        if(i == str.length()){
            return;
        }else{
            switch(str.charAt(i)){
                case '0':
                    System.out.print("Zero ");
                    break;
                case '1':
                    System.out.print("One ");
                    break;
                case '2':
                    System.out.print("Two ");
                    break;
                case '3':
                    System.out.print("Three ");
                    break;
                case '4':
                    System.out.print("Four ");
                    break;
                case '5':
                    System.out.print("Five ");
                    break;
                case '6':
                    System.out.print("Six ");
                    break;
                case '7':
                    System.out.print("Seven ");
                    break;
                case '8':
                    System.out.print("Eight ");
                    break;
                case '9':
                    System.out.print("Nine ");
                    break;
                
            }
        }
        numberToString(str , i+1);
    }
}