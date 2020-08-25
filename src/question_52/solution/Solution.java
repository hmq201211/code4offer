package question_52.solution;

import common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        boolean AChanged = false;
        boolean BChanged = false;
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            if (a.next != null)
                a = a.next;
            else {
                if (!AChanged) {
                    a = headB;
                    AChanged = true;
                } else {
                    break;
                }
            }
            if (b.next != null)
                b = b.next;
            else {
                if (!BChanged) {
                    b = headA;
                    BChanged = true;
                } else {
                    break;
                }
            }
        }
        return a;
    }
}