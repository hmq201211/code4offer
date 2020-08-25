package question_42.solution;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-25 16:47
 **/
public class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + nums[i];
            } else {
                dp[i] = nums[i];
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

    public int maxSubArrayOptimized(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
