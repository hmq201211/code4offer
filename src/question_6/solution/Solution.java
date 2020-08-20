package question_6.solution;

import common.ListNode;

import java.util.Stack;

public class Solution {
    public int[] reversePrint(ListNode head) {
        if (head == null)
            return new int[]{};
        else {
            Stack<Integer> stack = new Stack<>();
            while (head != null) {
                stack.push(head.val);
                head = head.next;
            }
            int[] result = new int[stack.size()];
            int index = 0;
            while (stack.size() != 0) {
                result[index++] = stack.pop();
            }
            return result;
        }
    }
}
