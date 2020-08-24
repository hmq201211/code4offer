package question_39.solution;

import java.util.Arrays;

public class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    public int majorityElement2(int[] nums) {
        int x = Integer.MIN_VALUE;
        int votes = 0;
        for (int i : nums) {
            if (votes == 0) {
                x = i;
                votes = 1;
            } else {
                if (x == i) {
                    votes += 1;
                } else {
                    votes -= 1;
                }
            }
        }
        return x;
    }
}
