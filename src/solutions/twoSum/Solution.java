package solutions.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[] { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int complement = target - val;
            if (map.containsKey(complement)) {
                answer[0] = map.get(complement);
                answer[1] = i;
            } else {
                map.put(val, i);
            }
        }
        return answer;
    }
}
