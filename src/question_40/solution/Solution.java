package question_40.solution;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 2, 3, 2, 1, 1, 2, 0, 4};
        int[] leastNumbers = new Solution().getLeastNumbers(nums, 9);
        System.out.println(Arrays.toString(leastNumbers));
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k >= arr.length)
            return arr;
        partitionInPlace(arr, 0, arr.length - 1, k);
        int[] toReturn = new int[k];
        for (int i = 0; i < k; i++) {
            toReturn[i] = arr[i];
        }
        return toReturn;
    }

    private void partitionInPlace(int[] nums, int lo, int hi, int k) {
        int partition = partition(nums, lo, hi);
        if (partition == k) {
            return;
        } else {
            if (partition > k) {
                partitionInPlace(nums, lo, partition - 1, k);
            } else {
                partitionInPlace(nums, partition + 1, hi, k);
            }
        }
    }

    private int partition(int[] nums, int lo, int high) {
        int target = nums[lo];
        int i = lo, j = high + 1;
        while (true) {
            while (++i <= high && nums[i] < target) ;
            while (--j >= lo && nums[j] > target) ;
            if (i >= j) {
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, lo, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}