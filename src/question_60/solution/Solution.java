package question_60.solution;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-27 16:54
 **/
public class Solution {
    public double[] twoSum(int n) {
        int[] pre = new int[]{1, 1, 1, 1, 1, 1};
        for (int i = 2; i <= n; i++) {
            int[] temp = new int[i * 5 + 1];
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j + k] += pre[j];
                }
            }
            pre = temp;
        }
        double all = Math.pow(6, n);
        return Arrays.stream(pre).asDoubleStream().map(item -> item / all).toArray();
    }
}