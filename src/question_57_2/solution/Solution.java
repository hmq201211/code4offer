package question_57_2.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-26 16:57
 **/
public class Solution {
    public int[][] findContinuousSequence(int target) {
        List<int[]> toReturn = new ArrayList<>();
        int l = 1;
        int r = 1;
        int sum = 0;
        while (l <= target / 2) {
            if (sum == target) {
                int[] answer = new int[r - l];
                for (int t = l; t < r; t++) {
                    answer[t - l] = t;
                }
                toReturn.add(answer);
                sum -= l++;
            } else if (sum > target) {
                sum -= l++;
            } else {
                sum += r++;
            }
        }
        return toReturn.toArray(new int[toReturn.size()][]);
    }
}