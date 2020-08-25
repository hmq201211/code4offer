package question_53_1.solution;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Solution {
    // 二分查找
    public int search(int[] nums, int target) {
        int index = binarySearch(nums, 0, nums.length - 1, target);
        if (index != -1) {
            return spread(nums, index);
        } else {
            return 0;
        }
    }

    private int spread(int[] nums, int index) {
        int count = 1;
        for (int i = index - 1; i >= 0 && nums[i] == nums[index]; i--, count++) ;
        for (int i = index + 1; i < nums.length && nums[i] == nums[index]; i++, count++) ;
        return count;
    }

    private int binarySearch(int[] nums, int lo, int hi, int target) {
        if (lo > hi || (lo == hi && nums[lo] != target)) {
            return -1;
        }
        int index = (lo + hi) / 2;
        if (nums[index] == target) {
            return index;
        } else if (nums[index] > target) {
            return binarySearch(nums, lo, index - 1, target);
        } else {
            return binarySearch(nums, index + 1, hi, target);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{1, 2, 2, 2, 2, 2, 2, 3}, 2));
    }
}
