package solutions.nimgame;

/**
 * Here are some manually calculated solutions. Notice the pattern.
 *
 * n = 1, true. n = 2, true. n = 3, true. n = 4, false.
 * n = 5, true. n = 6, true. n = 7, true. n = 8, false.
 * n = 9, true. n = 10, true. n = 11, true. n = 12, false.
 *
 * It appears that as long as it's your turn and there is not a multiple of 4 stones left on the board, you can always
 * put your opponent in a position that is a guaranteed loss (a multiple of 4 stones).
 *
 * O(1)
 */

public class Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}