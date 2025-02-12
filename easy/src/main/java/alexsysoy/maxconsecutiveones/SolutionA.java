package alexsysoy.maxconsecutiveones;

public class SolutionA implements Solution {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (result < count) {
                    result = count;
                }
                count = 0;
            }
        }
        if (result < count) {
            result = count;
        }
        return result;
    }
}
