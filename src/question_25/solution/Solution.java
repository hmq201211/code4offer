package question_25.solution;

import common.ListNode;

public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode point = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                point.next = l2;
                l2 = l2.next;
            } else {
                point.next = l1;
                l1 = l1.next;
            }
            point = point.next;
        }
        point.next = l1 == null ? l2 : l1;
        return dummy.next;
    }
}
