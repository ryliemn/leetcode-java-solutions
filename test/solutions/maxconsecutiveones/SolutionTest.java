package solutions.maxconsecutiveones;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxConsecutiveOnesTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        int[] nums = new int[] {1, 1, 0, 1, 1, 1};
        int expected = 3;
        int actual = solution.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }

    @Test
    void testNoOnes() {
        int[] nums = new int[] {0, 0, 0, 0, 0, 0};
        int expected = 0;
        int actual = solution.findMaxConsecutiveOnes(nums);
        assertEquals(expected, actual);
    }

}