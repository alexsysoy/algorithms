package alexsysoy.maximumnumberofvowelsinasubstringofgivenlength;

public class SolutionA implements Solution {
    private static final String VOWELS = "aeiou";

    @Override
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        int left = 0;
        int right = left + k - 1;
        int max = 0;
        int tmp = 0;

        if (chars.length == 1) {
            return isVowels(chars[0]) ? 1 : 0;
        }

        for (int i = left; i <= right; i++) {
            if (isVowels(chars[i])) {
                tmp++;
            }
        }

        max = tmp;

        while (right < n - 1) {
            right++;

            if (isVowels(chars[right])) {
                tmp++;
            }

            if (isVowels(chars[left])) {
                tmp--;
            }

            if (tmp > max) {
                max = tmp;
            }

            left++;
        }

        return max;
    }

    private boolean isVowels(char c) {
        return VOWELS.indexOf(c) != -1;
    }
}
