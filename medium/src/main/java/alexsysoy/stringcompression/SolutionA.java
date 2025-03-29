package alexsysoy.stringcompression;

public class SolutionA implements Solution {
    @Override
    public int compress(char[] chars) {
        int l = chars.length;
        int res = 0;
        int i = 0;

        while (i < l) {
            char c = chars[i];
            int tmp = 1;
            int count = 1;
            while (i + count < l && chars[i + count] == c) {
                count++;
            }

            chars[res++] = c;

            if (count > 1) {
                for (char ch : Integer.toString(count).toCharArray()) {
                    chars[res++] = ch;
                }
            }
            i += count;
        }

        return res;
    }
}
