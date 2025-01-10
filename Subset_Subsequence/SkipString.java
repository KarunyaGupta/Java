class SkipString{
    public static void main(String[] args){
        String sentence = "Hello World , My name is Karunya Gupta";
        String word = "World";
        String res = skipStr(sentence,word);
        System.out.print(res);
    }
    public static String skipStr(String sentence , String word){
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(!words[i].equals(word)){
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}