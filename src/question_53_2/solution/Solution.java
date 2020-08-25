package question_53_2.solution;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (mid == nums[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return lo;
    }


    public static void main(String[] args) {
        System.out.println(3 / 2);
        int[] arr = new int[]{0, 2, 3};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(new Solution().missingNumber(arr));
    }
}
