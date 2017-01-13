package solutions.battleshipsinaboard;

/**
 * Had to get a little prodding to figure out how to do this one with one pass and no extra space.
 *
 * The basic idea is to only count a battleship when you've encountered its topmost, leftmost element. This is done
 * first by checking to make sure the index you're about to check isn't out of bounds, and then if not, seeing if
 * that element is equal to '.'. If either is true, and you're inspecting an 'X', then that's the topmost leftmost
 * element. All other elements within the battleship will be disregarded.
 *
 * Knowing this, it's simple to see how one pass through is possible. It's no different from counting the number of
 * X's in a 2d char array, just with a few extra criteria for the element we're searching for.
 *
 * i goes along the x axis (horizontal), j goes along the y axis (vertical)
 */

public class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                boolean aboveIsEmpty = j - 1 < 0 || board[i][j - 1] == '.';
                boolean leftIsEmpty = i - 1 < 0 || board[i - 1][j] == '.';
                if (aboveIsEmpty && leftIsEmpty && board[i][j] == 'X') {
                    count++;
                }
            }
        }
        return count;
    }
}
