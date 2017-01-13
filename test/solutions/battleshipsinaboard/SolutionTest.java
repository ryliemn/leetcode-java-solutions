package solutions.battleshipsinaboard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    public Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void countBattleships() {
        char[][] board = new char[][] {
                new char[] {'X', '.', '.', '.', '.'},
                new char[] {'X', '.', 'X', 'X', 'X'},
                new char[] {'X', '.', '.', '.', '.'},
                new char[] {'.', '.', '.', '.', '.'},
                new char[] {'.', '.', '.', '.', '.'},
                new char[] {'X', 'X', 'X', '.', '.'}
        };
        int expected = 3;
        int actual = solution.countBattleships(board);
        assertEquals(expected, actual);
    }

}