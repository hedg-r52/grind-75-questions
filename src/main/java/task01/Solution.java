package task01;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (numMap.containsKey(delta)) {
                return new int[]{numMap.get(delta), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
