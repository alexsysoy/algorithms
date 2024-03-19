package alexsysoy.reverseinteger;

/**
 * Runtime 1 ms 85.78%
 * Memory 40.58 MB 82.86%
 */
public class SolutionA implements Solution {
    @Override
    public int reverse(int x) {
        int stumpMax = 147_483_647;
        int stumpMin = -147_483_648;
        int hundredMillion = 100_000_000;
        boolean sign;
        int count = 1;
        int unsigned;
        int s = 0;

        if (x == Integer.MIN_VALUE) {
            return 0;
        }

        if (x >= 0) {
            sign = false;
            unsigned = x;
        } else {
            sign = true;
            unsigned = -x;
        }

        int r = unsigned % 10;
        int flag = r;
        int digits = (int) Math.log10(unsigned) + 1;

        while (unsigned != 0) {
            if (count == 10 && digits == 10) {
                if (flag > 2) {
                    return 0;
                }
                if (flag == 2) {
                    int stump = (s % hundredMillion) * 10 + r;
                    if (!sign) {
                        if (stump >= stumpMax) {
                            return 0;
                        }
                    } else {
                        if (-stump < stumpMin) {
                            return 0;
                        }
                    }
                }
            }
            s = s * 10 + r;
            unsigned = unsigned / 10;
            r = unsigned % 10;
            count++;
        }

        return sign ? -s : s;
    }
}
