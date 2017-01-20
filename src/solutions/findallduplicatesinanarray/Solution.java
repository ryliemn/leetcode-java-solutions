package solutions.findallduplicatesinanarray;

import java.util.ArrayList;
import java.util.List;

/**
 * The solution requires only one pass through the array. Since the domain of possible numbers is between 1 and the
 * size of the array inclusive, and arrays are 0 indexed, we'll have to take care not to get off by one errors.
 *
 * For each value in the array, grab the absolute value for nums[i] minus one. We'll call this number x. Go to nums[x]
 * and make this value the negative of the number found there. A negative value at any index i, means that we've seen
 * abs(nums[i]) + 1 in the array already. This means a negative value can safely be added to our returned list of ints.
 */

public class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int x = Math.abs(nums[i]) - 1;
            int valAtX = nums[x];
            if (valAtX > 0) {
                nums[x] = -valAtX;
            } else if (valAtX < 0) {
                list.add(x + 1);
            }
        }

        return list;
    }
}
