class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");

        int word = words[words.length-1].length();
        return word;
    }
}