package question_3.solution;

import java.util.Arrays;

public class Solution {
    private void swap(int[] ints, int i, int j) {
        int temp = ints[i];
        ints[i] = ints[j];
        ints[j] = temp;
    }

    public int duplicate(int[] ints, int length) {
        if (ints == null || length <= 0) {
            return -1;
        }
        for (int i = 0; i < length; i++) {
            while (ints[i] != i) {
                if (ints[i] == ints[ints[i]]) {
                    return ints[i];
                }
                swap(ints, i, ints[i]);
                System.out.println(Arrays.toString(ints));
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {4, 1, 1, 2, 3};
        System.out.println(new Solution().duplicate(ints, 5));
    }

}
