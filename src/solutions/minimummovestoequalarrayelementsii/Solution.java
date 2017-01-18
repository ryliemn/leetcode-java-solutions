package solutions.minimummovestoequalarrayelementsii;

import java.util.Arrays;

/**
 * Start by sorting the array and finding the median. Honestly, I wasn't 100% sure about the median being what was
 * required, but it seemed to work for all the test cases I manually checked so hey.
 *
 * Anyway, the median is basically the number all the other numbers need to converge on for the minimum distance to
 * have been traveled. Find the median, and sum up the absolute value of the median minus each value in the array.
 * The sum will be the minimum number of moves.
 *
 * Unfortunately, with the sort, must be an O(nlogn) algorithm.
 */

public class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length / 2];
        int dist = 0;
        for (int i = 0; i < nums.length; i++) {
            dist += Math.abs(median - nums[i]);
        }
        return dist;
    }
}
