package alexsysoy.cinemaseatallocation;

import java.util.HashMap;
import java.util.Map;

/**
 * Memory limit exception
 */
public class SolutionA implements Solution {
    @Override
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, boolean[]> rows = new HashMap<>();
        for (int i = 0; i < reservedSeats.length; i++) {
            int row = reservedSeats[i][0];
            int seat = reservedSeats[i][1];
            if (seat == 2 || seat == 3) {
                boolean[] booleans = rows.computeIfAbsent(row, k -> new boolean[4]);
                booleans[0] = true;
            }
            if (seat == 4 || seat == 5) {
                boolean[] booleans = rows.computeIfAbsent(row, k -> new boolean[4]);
                booleans[1] = true;
            }
            if (seat == 6 || seat == 7) {
                boolean[] booleans = rows.computeIfAbsent(row, k -> new boolean[4]);
                booleans[2] = true;
            }
            if (seat == 8 || seat == 9) {
                boolean[] booleans = rows.computeIfAbsent(row, k -> new boolean[4]);
                booleans[3] = true;
            }
        }

        int res = n * 2;
        for (boolean[] value : rows.values()) {
            if ((value[0] && value[1] && value[2] && value[3])
                    || (value[0] && value[1] && value[2])
                    || (value[1] && value[2] && value[3])
                    || (value[0] && value[2])
                    || (value[1] && value[3])
                    || value[1] && value[2]) {
                res -= 2;
            } else if ((value[0] || value[1])
                    || (value[2] || value[3])) {
                res -= 1;
            }
        }

        return res;
    }
}
