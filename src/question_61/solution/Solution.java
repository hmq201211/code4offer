package question_61.solution;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-27 17:11
 **/
public class Solution {
    public boolean isStraight(int[] nums) {
        if (nums == null || nums.length < 5)
            return false;
        Arrays.sort(nums);
        int zeroCount = 0;
        int current = 0;
        while (current <= 3) {
            if (nums[current] == 0) {
                zeroCount++;
                current++;
            } else {
                if (nums[current] == nums[current + 1]) {
                    return false;
                } else {
                    zeroCount -= (nums[current + 1] - nums[current] - 1);
                    if (zeroCount < 0) {
                        return false;
                    }
                }
                current++;
            }
        }
        return true;
    }
}
