package solutions.singlenumber;

/**
 * XORing a number against itself results in a 0. In fact, take any number x, XOR it with any number Y, then XOR it with
 * Y again, and you will end up with x again. We can use this idea to our advantage here.
 *
 * Initialize x to 0. XOR it against every number in the given array. For every number that appears twice, the XORing
 * will simply cancel it out. The number that remains in x after all is said and done is the number without a duplicate.
 *
 * O(n)
 */

public class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = x ^ nums[i];
        }
        return x;
    }
}