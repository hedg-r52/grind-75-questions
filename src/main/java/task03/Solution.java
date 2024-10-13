package task03;

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return new ListNode(list2.val, mergeTwoLists(null, list2.next));
        }
        if (list2 == null) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, null));
        }
        if (list1.val <= list2.val) {
            return new ListNode(list1.val, mergeTwoLists(list1.next, list2));
        } else {
            return new ListNode(list2.val, mergeTwoLists(list1, list2.next));
        }
    }
}
