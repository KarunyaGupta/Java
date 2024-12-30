class AlphabetSeries{
    public static void main(String[] args){
        String series = "";
        for(int i=0;i<26;i++){
            series = series + (char)('a'+i) +" ";
        }
        System.out.println(series);
    }
}// not a good method