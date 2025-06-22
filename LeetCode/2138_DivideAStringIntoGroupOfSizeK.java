class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> temp = new ArrayList<>();
        int idx = 0;
        
        while (idx < s.length()) {
            if (idx + k <= s.length()) {
                temp.add(s.substring(idx, idx + k));
                idx += k;
            } else {
                String remaining = s.substring(idx);
                StringBuilder lastPart = new StringBuilder(remaining);
                while (lastPart.length() < k) {
                    lastPart.append(fill);
                }
                temp.add(lastPart.toString());
                break;
            }
        }
        
        return temp.toArray(new String[0]);
    }
}