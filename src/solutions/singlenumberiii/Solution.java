package solutions.singlenumberiii;

import java.util.HashMap;
import java.util.Map;

/**
 * BAD SOLUTION, shouldn't be using extra space. Come back to this one.
 */

public class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        int[] retNums = new int[2];
        boolean firstSeen = false;

        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                if (firstSeen) {
                    retNums[1] = i;
                } else {
                    retNums[0] = i;
                    firstSeen = true;
                }
            }
        }

        return retNums;
    }
}
