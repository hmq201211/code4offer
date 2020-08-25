package question_40.solution;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int index = partition(arr, 0, arr.length - 1);
        while (index !=)

    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private int partition(int[] nums, int lo, int hi) {
        int target = nums[0];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && nums[i] < target) ;
            while (--j >= lo && nums[j] > target) ;
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, 0, j);
        return j;
    }
}
