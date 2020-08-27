package question_59_1.solution;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return new int[]{};
        int[] toReturn = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        int i = 0;
        int j = 0;
        for (; j < k; j++) {
            while (!deque.isEmpty() && deque.getLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
        }
        toReturn[i] = deque.getFirst();
        for (; j < nums.length; j++) {
            if (deque.getFirst() == nums[i++]) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && deque.getLast() < nums[j]) {
                deque.removeLast();
            }
            deque.addLast(nums[j]);
            toReturn[i] = deque.getFirst();
        }
        return toReturn;
    }
}