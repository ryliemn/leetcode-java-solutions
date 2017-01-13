package solutions.twosum;

import java.util.HashMap;
import java.util.Map;

/**
 * I'd always used the sorting solution prior to this, but realized this is actually faster, but requires the storage
 * of a map. Only requires a maximum of one walkthrough of the list of numbers, though.
 *
 * For each number, check to see if its complement (target - num) is in the hash map. If it isn't, add the current
 * number, mapped to its index, to the hash map. If it IS, do a get to get the complement's index, and alter the answer
 * array to feature the found indices. We add an extra conditional to the for loop, so we can safely break out of the
 * loop when the answer is found. An alternate method is with a break statement, but I don't particularly like those.
 */

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[] { -1, -1 };
        for (int i = 0; i < nums.length && answer[0] == -1; i++) {
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