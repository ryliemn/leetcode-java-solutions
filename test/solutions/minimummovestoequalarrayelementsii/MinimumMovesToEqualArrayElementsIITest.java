package solutions.minimummovestoequalarrayelementsii;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumMovesToEqualArrayElementsIITest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        int[] nums = new int[] {1, 2, 3};
        int expected = 2;
        int actual = solution.minMoves2(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testEvenExample() {
        int[] nums = new int[] {0, 1, 2, 5};
        int expected = 6;
        int actual = solution.minMoves2(nums);
        assertEquals(expected, actual);
    }

}