package alexsysoy.cinemaseatallocation;

/**
 * Input: n = 3, reservedSeats = [[1,2],[1,3],[1,8],[2,6],[3,1],[3,10]]
 * Output: 4
 * Explanation: The figure above shows the optimal allocation for four groups,
 * where seats mark with blue are already reserved and contiguous seats mark with orange are for one group.
 */
public interface Solution {
    int maxNumberOfFamilies(int n, int[][] reservedSeats);
}
