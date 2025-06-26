class Solution {
    public int longestSubsequence(String s, int k) {
        int sum = 0;
        int len = 0;
        int bitPos = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '0') {
                len++;
            } else {
                if (bitPos < 31 && sum + (1 << bitPos) <= k) {
                    sum += (1 << bitPos);
                    len++;
                }
            }
            bitPos++;
        }

        return len;
    }
}
