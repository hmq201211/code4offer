package question_57.solution;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-26 16:30
 **/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] toReturn = new int[2];
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                toReturn[0] = nums[left];
                toReturn[1] = nums[right];
                break;
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return toReturn;
    }
}