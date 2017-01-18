package solutions.arithmeticslices;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticSlicesTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        int[] a = new int[] {1, 2, 3, 4};
        int expected = 3;
        int actual = solution.numberOfArithmeticSlices(a);
        assertEquals(expected, actual);
    }

    @Test
    void testComplexSequence() {
        int[] a = new int[] {1, 3, 5, 6, 7, 8, 12, 14, 16, 18};
        int expected = 7;
        int actual = solution.numberOfArithmeticSlices(a);
        assertEquals(expected, actual);
    }

}