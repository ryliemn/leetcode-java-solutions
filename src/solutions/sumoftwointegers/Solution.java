package solutions.sumoftwointegers;

/**
 * + and - are not allowed, so let's consider how we might do this with bit manipulation.
 *
 * If we AND two numbers, we get a result that has 1s wherever both the numbers had 1s. If we bit shift this one spot to
 * the left, we essentially get the "carry" bits that we get from adding the two numbers, in their correct place values.
 *
 * If we XOR two numbers, we get a 1 where either number had a 1, but not where both of them had 1s. Essentially,
 * this is the sum of the two numbers without any carry bits. This should complement the previous number nicely.
 *
 * From here, it is the simple matter of continuing this loop until a is equal to zero.
 */

public class Solution {
    public int getSum(int a, int b) {
        int aTmp;

        while (a != 0) {
            aTmp = (a & b) << 1;
            b = a ^ b;
            a = aTmp;
        }

        return b;
    }
}
