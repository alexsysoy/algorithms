package alexsysoy.shiftingletters;

public class SolutionA implements Solution {
    @Override
    public String shiftingLetters(String s, int[] shifts) {
        long[] moves = new long[shifts.length];
        long sum = shifts[shifts.length - 1];
        moves[shifts.length - 1] = sum;
        for (int i = shifts.length - 2; i >= 0 ; i--) {
            sum += shifts[i];
            moves[i] = sum;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shifts.length; i++) {
            sb.append(shift(chars[i], moves[i]));
        }
        return sb.toString();
    }

    private char shift(char c, long offset) {
        long t = c - 'a' + offset;
        if (t > 26) {
            t = t % 26;
        }
        return (char) (t + 'a');
    }
}

