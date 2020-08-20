package question_18.solution;

import common.ListNode;

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;
        ListNode before = dummy;
        while (head.val != val) {
            head = head.next;
            before = before.next;
        }
        before.next = head.next;
        return dummy.next;
    }
}