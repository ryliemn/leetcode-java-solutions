package solutions.sortcharactersbyfrequency;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortCharactersByFrequencyTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void testGivenExampleOne() {
        String s = "tree";
        String expected = "eert";
        String actual = solution.frequencySort(s);
        assertEquals(expected, actual);
    }

}