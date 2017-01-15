package solutions.maxconsecutiveones;

/**
 * Very straightforward one. Takes nothing more than a single walkthrough of the array. Keep track of two values;
 * the cur number of 1s and the max number of 1s you've found so far. If you see a 1, increment the curOnes. If a
 * 0 is seen, assign maxOnes to the max between maxOnes and curOnes, and reset curOnes.
 *
 * Small edge cases when the array ends with the longest consecutive sequence of ones. To account for this, when
 * returning, simply do one last max check between maxOnes and Curones.
 */

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int curOnes = 0;

        for (int i : nums) {
            if (i == 1) {
                curOnes++;
            } else {
                maxOnes = Math.max(maxOnes, curOnes);
                curOnes = 0;
            }
        }

        return Math.max(maxOnes, curOnes);
    }
}
