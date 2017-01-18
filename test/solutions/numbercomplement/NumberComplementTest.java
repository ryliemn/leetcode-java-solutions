package solutions.numbercomplement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberComplementTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testFirstGivenExample() {
        int num = 5;
        int expected = 2;
        int actual = solution.findComplement(num);
        assertEquals(expected, actual);
    }

    @Test
    void testSecondGivenExample() {
        int num = 1;
        int expected = 0;
        int actual = solution.findComplement(num);
        assertEquals(expected, actual);
    }

    @Test
    void testPowerOfTwo() {
        int num = 16;
        int expected = 15;
        int actual = solution.findComplement(num);
        assertEquals(expected, actual);
    }

    @Test
    void testOne() {
        int num = 1;
        int expected = 0;
        int actual = solution.findComplement(num);
        assertEquals(expected, actual);
    }

    @Test
    void testLargeNumber() {
        int num = 2147483647;
        int expected = 0;
        int actual = solution.findComplement(num);
        assertEquals(expected, actual);
    }

}