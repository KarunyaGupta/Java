class BinaryStringsProblem{
    public static void main(String[] args){
        String binary = "000000";
        // boolean res = true;
        // for(int i=0;i<binary.length()-1;i++){
        //     // char ch  = binary.chatAt(i);
        //     if(binary.charAt(i)=='1' && binary.charAt(i+1)=='1'){
        //         res = false;
        //     }
        // }
        // System.out.print(res);
        printBinaryStrings(5,0,"");
    }

    public static void printBinaryStrings(int n , int lastPlace , String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryStrings(n-1,0,str+"0");
        if(lastPlace==0){
            printBinaryStrings(n-1,1,str+"1");
        } 
        
    }
}