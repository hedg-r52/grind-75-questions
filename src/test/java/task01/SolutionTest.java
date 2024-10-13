package task01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void whenArray_2_7_11_15_Target_9_ThenOutput_0_1() {
        int[] input = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] expected = new int[] {0, 1};
        int[] actual = solution.twoSum(input, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void whenArray_3_2_4_Target_6_ThenOutput_1_2() {
        int[] input = new int[] {3, 2, 4};
        int target = 6;

        int[] expected = new int[] {1, 2};
        int[] actual = solution.twoSum(input, target);

        assertArrayEquals(expected, actual);
    }

    @Test
    void whenArray_3_3_Target_6_ThenOutput_0_1() {
        int[] input = new int[] {3, 3};
        int target = 6;

        int[] expected = new int[] {0, 1};
        int[] actual = solution.twoSum(input, target);

        assertArrayEquals(expected, actual);
    }
}