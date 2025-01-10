class RemoveACharacter{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String str = "Hello world";
        char rmv = 'l';
        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i)!= rmv){
        //         sb.append(str.charAt(i));
        //     }
        // }
        // System.out.print(sb.toString());


        //recursion call
        String result  = removeCharacter(str,rmv , 0);
        System.out.print(result);

    }


    // using recursion
    public static String removeCharacter(String str, char rmv , int i){
        if(i>=str.length()){
            return "";
        }
        if(str.charAt(i)!=rmv){
            return str.charAt(i)+ removeCharacter(str,rmv,i+1);
        }

        return removeCharacter(str,rmv , i+1);
    }
}