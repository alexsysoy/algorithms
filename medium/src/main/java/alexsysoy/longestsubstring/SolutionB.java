package alexsysoy.longestsubstring;

public class SolutionB implements Solution {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        int left = 0;
        int max = 0;
        for(int right = 0; right < s.length(); right++) {
            left = Math.max(left, chars[s.charAt(right)]);
            max = Math.max(max, right - left + 1);
            chars[s.charAt(right)] = right + 1;
        }
        return max;
    }
}
