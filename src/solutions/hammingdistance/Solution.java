package solutions.hammingdistance;

/**
 * The problem given turns into a fairly simple one in code. Essentially, we just need to xor the two numbers,
 * convert the result to a bit string, and count the 1's in the bitstring.
 *
 * Would have liked to do this with a lambda, but I don't know much about Java 8's streams yet, and in this
 * particular case it probably would have wound up being more code anyway. Hopefully I find a more appropriate use
 * case for it.
 */

public class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x ^ y;
        String bits = Integer.toBinaryString(xor);
        int count = 0;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }
}
