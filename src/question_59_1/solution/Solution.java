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
            if (deque.isEmpty()) {
                deque.addLast(nums[j]);
            } else if (deque.getLast() <= nums[j]) {
                deque.addLast(nums[j]);
            }
        }
        toReturn[i] = deque.getLast();
        for (; j < nums.length; j++) {
            if (deque.getFirst() == nums[i++]) {
                deque.removeFirst();
            }
            if (deque.isEmpty() || nums[j] >= deque.getLast()) {
                deque.addLast(nums[j]);
            }
            toReturn[i] = deque.getLast();
        }
        return toReturn;
    }
}