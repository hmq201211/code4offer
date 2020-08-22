package question_24.solution;

import common.ListNode;
import org.w3c.dom.NodeList;

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 递归思想 剩下的已经反转好了
        ListNode toReturn = reverseList(head.next);
        // 将次节点的next引用指向当前节点
        head.next.next = head;
        // 当前节点的next为空 因为是尾元素了
        head.next = null;
        String s = ListNode.printListNode(toReturn);
        System.out.println(s);

        return toReturn;
    }

    public ListNode reverseListIteration(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newNode = null;
        while (head!=null){
            ListNode temp = head.next;
            head.next = newNode;
            newNode = head;
            head = temp;
        }
        return newNode;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        ListNode head4 = new ListNode(2);
        ListNode head5 = new ListNode(1);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        ListNode listNode = new Solution().reverseListIteration(head);

        System.out.println(ListNode.printListNode(listNode));


    }
}