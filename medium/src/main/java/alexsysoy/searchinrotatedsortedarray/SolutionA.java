package alexsysoy.searchinrotatedsortedarray;

public class SolutionA implements Solution {
    @Override
    public int search(int[] nums, int target) {
        int low = 0;
        int hi = nums.length - 1;
        while (low <= hi) {
            int mid = low + (hi - low) / 2 + 1;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[low] > nums[mid]) {
                hi = mid;
            } else {
                low = mid;
            }
        }
        return -1;
    }
}
