package alexsysoy.foursum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionA implements Solution {
    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length - 1;

        Arrays.sort(nums);

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < len - 1; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }

                int k = j + 1;
                int l = len;

                while (k < l) {
                    //Critical! Cast to long otherwise, the variable sum will overflow
                    long sum = nums[i] + nums[j];
                    sum += nums[k] + nums[l];

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k++], nums[l--]));
                        while (k < l && nums[k - 1] == nums[k]) {
                            k++;
                        }
                        while (k < l && nums[l + 1] == nums[l]) {
                            l--;
                        }
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
