package common;

import org.w3c.dom.ls.LSException;

import java.util.Stack;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static String printListNode(ListNode listNode) {
        StringBuilder stringBuffer = new StringBuilder();
        while (listNode != null) {
            stringBuffer.append(listNode.val);
            stringBuffer.append("->");
            listNode = listNode.next;
        }
        return stringBuffer.toString();
    }
}