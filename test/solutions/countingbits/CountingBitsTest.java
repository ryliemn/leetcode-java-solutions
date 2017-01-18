package solutions.countingbits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingBitsTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        int num = 5;
        int[] expected = new int[] {0, 1, 1, 2, 1, 2};
        int[] actual = solution.countBits(num);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testZero() {
        int num = 0;
        int[] expected = new int[] {0};
        int[] actual = solution.countBits(num);
        assertArrayEquals(expected, actual);
    }

}