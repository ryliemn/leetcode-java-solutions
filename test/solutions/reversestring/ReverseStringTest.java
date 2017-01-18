package solutions.reversestring;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExample() {
        String s = "hello";
        String expected = "olleh";
        String actual = solution.reverseString(s);
        assertEquals(expected, actual);
    }

}