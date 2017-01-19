package solutions.findallnumbersdisappearedinanarray;

import java.util.ArrayList;
import java.util.List;

/**
 * Needed a bit of prodding for this one to figure out the solution with no extra space and O(n) time.
 *
 * The trick lies in using the given array to keep track of numbers seen. For any given value in the array, let's call
 * it nums[i], use it as an index to access nums[nums[i] - 1] (minus one because the numbers are 1 to n inclusive), and
 * flip it to a negative. A negative number at i means we've seen i + 1 in the array. Utilize absolute values, to ensure
 * we don't end up with any index out of bounds errors, or accidentally flip any already negative numbers.
 *
 * After this is done, loop through the array one more time. If we encounter any positive values, it means that index
 * plus one wasn't seen in the array.
 */

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dis = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            nums[val - 1] = -Math.abs(nums[val - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                dis.add(i + 1);
            }
        }

        return dis;
    }
}