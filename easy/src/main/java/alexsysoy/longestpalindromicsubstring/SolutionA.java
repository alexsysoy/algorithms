package alexsysoy.longestpalindromicsubstring;

public class SolutionA implements Solution {
    @Override
    public String longestPalindrome(String s) {
        int n = s.length();

        if (n <= 1) {
            return s;
        }

        String res = s.substring(0, 1);
        int maxLen = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i + maxLen; j <= n; j++) {
                if (j - i > maxLen && isPalindrom(s.substring(i, j))) {
                    res = s.substring(i, j);
                    maxLen = j - i;
                }
            }
        }

        return res;

    }

    private boolean isPalindrom(String sub) {
        int left = 0;
        int right = sub.length() - 1;

        while (left < right) {
            if (sub.charAt(left) != sub.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
