package solutions.sumoftwointegers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testPositives() {
        int a = 8;
        int b = 12;
        int expected = 20;
        int actual = solution.getSum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void testNegatives() {
        int a = -8;
        int b = -12;
        int expected = -20;
        int actual = solution.getSum(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void testZeroSum() {
        int a = -1;
        int b = 1;
        int expected = 0;
        int actual = solution.getSum(a, b);
        assertEquals(expected, actual);
    }

}