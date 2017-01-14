package solutions.countingbits;

/**
 * This one utilizes some bitwise operations and some dynamic programming.
 *
 * Consider the following two bitstrings and their decimal equivalents: 0101 (6), 1101 (14).
 * Their bit strings only differ by one, in the leftmost place value. It's the equivalent of adding 1000 (8) to the
 * first string. Also note that all bit strings starting with 1, followed by any number of 0s, are powers of two.
 *
 * If we keep this in mind, finding the number of 1s in a number is easy if we know the number of 1s in all previous
 * numbers. Check to see how many 1s the number at i MINUS the most recent power of two seen, then add one to that
 * value.
 *
 * One caveat, we need to be checking to see when we encounter the powers of two themselves. I'm using a bitwise
 * operation here, ANDing i and i - 1 (for example, 1000 & 0111) should result in 0. It's a fairly quick way to
 * identify powers of two. Under different circumstances, I might establish a constant HashSet containing powers of two,
 * and then checking to see if that contains the current number, but I'm not sure if that would be any faster than
 * doing the bitwise operation every time.
 */

public class Solution {
    public int[] countBits(int num) {
        int curPowOfTwo = 1;
        int[] counts = new int[num + 1];
        counts[0] = 0;

        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                curPowOfTwo = i;
                counts[i] = 1;
            } else {
                counts[i] = counts[i - curPowOfTwo] + 1;
            }
        }
        return counts;
    }
}
