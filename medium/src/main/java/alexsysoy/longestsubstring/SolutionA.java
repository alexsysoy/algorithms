package alexsysoy.longestsubstring;

/**
 * Runtime 8ms 27.07%
 * Memory 45.26 mb 13.23%
 */
public class SolutionA implements Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        String tmp = "";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (tmp.contains(c)) {
                int index = tmp.indexOf(c);
                result = Math.max(result, tmp.length());
                tmp = tmp.substring(index + 1) + c;
            } else {
                tmp = tmp + c;
            }
        }
        result = Math.max(result, tmp.length());
        return result;
    }
}
