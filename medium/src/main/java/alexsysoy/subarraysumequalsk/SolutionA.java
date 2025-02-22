package alexsysoy.subarraysumequalsk;

import java.util.HashMap;
import java.util.Map;

public class SolutionA implements Solution {
    @Override
    public int subarraySum(int[] nums, int k) {
        int s = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            s += nums[i] & 1;
            if (map.containsKey(s - k)) {
                res += map.get(s - k);
            }
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        return res;
    }
}
