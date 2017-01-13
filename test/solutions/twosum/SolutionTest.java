package solutions.twosum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    public Solution solution;

    @BeforeEach
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void testGivenExample() {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;
        int[] expected = new int[] {0, 1};
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testUnsortedArray() {
        int[] nums = new int[] {2, 7, 11, 15, 13, 5, 3, 30};
        int target = 37;
        int[] expected = new int[] {1, 7};
        int[] actual = solution.twoSum(nums, target);

        assertArrayEquals(expected, actual);
    }

}
