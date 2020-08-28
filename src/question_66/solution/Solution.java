package question_66.solution;

import java.util.Arrays;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-28 14:52
 **/
public class Solution {
    public int[] constructArr(int[] a) {
        if (a.length <= 1) {
            return a;
        }
        int[] toReturn = new int[a.length];
        Arrays.fill(toReturn, 1);
        int product = 1;
        for (int i = 1; i < a.length; i++) {
            product *= a[i - 1];
            toReturn[i] *= product;
        }
        product = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            product *= a[i + 1];
            toReturn[i] *= product;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        int[] re = new Solution().constructArr(test);
        System.out.println(Arrays.toString(re));
    }
}
