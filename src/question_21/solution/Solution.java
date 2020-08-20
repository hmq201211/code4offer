package question_21.solution;

class Solution {
    public int[] exchange(int[] nums) {
        int oddIndex = 0;
        int evenIndex = nums.length - 1;
        while (oddIndex < evenIndex) {
            if (nums[oddIndex] % 2 == 0) {
                if (nums[evenIndex] % 2 == 1) {
                    int temp = nums[evenIndex];
                    nums[evenIndex--] = nums[oddIndex];
                    nums[oddIndex++] = temp;
                } else {
                    evenIndex--;
                }
            } else {
                oddIndex++;
            }
        }
        return nums;
    }
}