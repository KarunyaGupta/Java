class SwapFirstLastChar {
    static String swapFirstLastChar(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 1) {
               word = word.charAt(word.length() - 1) + word.substring(1, word.length() - 1) + word.charAt(0);
                
            }
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args){
        String sentence = "Hey , my name is karunya";
        String res = swapFirstLastChar(sentence);
        System.out.print(res);
    }
}