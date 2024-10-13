package task03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void whenFirstList_1_2_4_Second_1_3_4_ThenResult_1_1_2_3_4_4() {
        ListNode first = fromList(new LinkedList<>(Arrays.asList(1, 2, 4)));
        ListNode second = fromList(new LinkedList<>(Arrays.asList(1, 3, 4)));

        ListNode result = solution.mergeTwoLists(first, second);
        int[] expected = new int[]{1, 1, 2, 3, 4, 4};
        int[] actual = toArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFirstList_1_3_5_Second_2_4_6_ThenResult_1_2_3_4_5_6() {
        ListNode first = fromList(new LinkedList<>(Arrays.asList(1, 3, 5)));
        ListNode second = fromList(new LinkedList<>(Arrays.asList(2, 4, 6)));

        ListNode result = solution.mergeTwoLists(first, second);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        int[] actual = toArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFirstEmpty_SecondEmpty_ThenResultEmpty() {
        ListNode first = null;
        ListNode second = null;

        ListNode result = solution.mergeTwoLists(first, second);
        int[] expected = new int[]{};
        int[] actual = toArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFirstEmpty_Second_0_ThenResult_0() {
        ListNode first = null;
        ListNode second = new ListNode(0);

        ListNode result = solution.mergeTwoLists(first, second);
        int[] expected = new int[]{0};
        int[] actual = toArray(result);
        assertArrayEquals(expected, actual);
    }


    private ListNode fromList(List<Integer> list) {
        if (list.isEmpty()) {
            return null;
        } else {
            return new ListNode(list.get(0), fromList(list.subList(1, list.size())));
        }
    }

    private int[] toArray(ListNode node) {
        ListNode current = node;
        List<Integer> result = new ArrayList<>();
        while (current != null) {
            result.add(current.val);
            current = current.next;
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}