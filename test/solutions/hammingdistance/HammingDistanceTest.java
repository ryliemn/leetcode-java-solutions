package solutions.hammingdistance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingDistanceTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        int x = 1;
        int y = 4;
        int expected = 2;
        int actual = solution.hammingDistance(x, y);
        assertEquals(expected, actual);
    }

    @Test
    void testLargerExample() {
        int x = 42;
        int y = 69;
        int expected = 6;
        int actual = solution.hammingDistance(x, y);
        assertEquals(expected, actual);
    }

}