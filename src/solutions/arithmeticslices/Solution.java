package solutions.arithmeticslices;

/**
 * Establish a slices count, starting at 0 of course.
 *
 * An outer for loop will point at the start of the sequence we're examining. It terminates at a.length - 2, as there
 * would be no reason to go any further than that since an arithmetic sequence needs to be 3 elements long. Now, find
 * the difference between the element at i and i + 1 (which won't ever go out of bounds due to the for loop termination
 * condition). We'll be using this difference in the next loop.
 *
 * Now, an inner loop points at the end of the current sequence. It starts at i + 2, and terminates at the end of the
 * list. In this loop, we examine, the elements at j and j - 1. If their difference is the same as the one established
 * in the outer loop, increment slices. If they're not equal, break out of the loop, since we know any sequences between
 * i and indices greater than j won't be arithmetic if this smaller one was not.
 *
 * In the end, return slices.
 */

public class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int slices = 0;

        for (int i = 0; i < a.length - 2; i++) {
            int diff = a[i + 1] - a[i];
            for (int j = i + 2; j < a.length; j++) {
                if (a[j] - a[j - 1] == diff) {
                    slices++;
                } else {
                    break;
                }
            }
        }
        return slices;
    }
}