package question_52.solution;

import common.ListNode;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        if (headA.next == headB.next)
            return headA.next;
        else {
            ListNode p1 = getIntersectionNode(headA.next, headB);
            ListNode p2 = getIntersectionNode(headA, headB.next);
            if (p1 != null)
                return p1;
            if (p2 != null)
                return p2;
            return null;
        }
    }
}