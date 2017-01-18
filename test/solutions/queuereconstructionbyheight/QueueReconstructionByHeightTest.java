package solutions.queuereconstructionbyheight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueReconstructionByHeightTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reconstructQueue() {
        int[][] nums = new int[][] {
                new int[] {7, 0},
                new int[] {4, 4},
                new int[] {7, 1},
                new int[] {5, 0},
                new int[] {6, 1},
                new int[] {5, 2}
        };
        int[][] expected = new int[][] {
                new int[] {5, 0},
                new int[] {7, 0},
                new int[] {5, 2},
                new int[] {6, 1},
                new int[] {4, 4},
                new int[] {7, 1}
        };
        int[][] actual = solution.reconstructQueue(nums);
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

}