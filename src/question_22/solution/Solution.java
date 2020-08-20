package question_22.solution;

import common.ListNode;

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head.next == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}