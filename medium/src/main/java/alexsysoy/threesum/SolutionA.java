package alexsysoy.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionA implements Solution {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int low = i + 1;
            int hi = nums.length - 1;

            while (low < hi) {
                int sum = nums[i] + nums[low] + nums[hi];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[low++], nums[hi--]));
                    while (low < hi && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low < hi && nums[hi + 1] == nums[hi]) {
                        hi--;
                    }
                } else if (sum > 0) {
                    hi--;
                } else {
                    low++;
                }
            }
        }
        return res;
    }
}
