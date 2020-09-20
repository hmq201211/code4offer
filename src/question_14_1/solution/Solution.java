package question_14_1.solution;

class Solution {
    public int cuttingRope(int n) {
        int[] memo = new int[n + 1];
        // 初始化 长度为1的绳子肯定长度为1
        memo[1] = 1;
        // 从长度为2的绳子开始计算
        for (int i = 2; i <= n; i++) {
            // j表示的是第一段绳子的长度 （总要有第一段绳子 长度从1开始算到i-1 为止 这样肯定可以遍历全部解空间）
            for (int j = 1; j < i; j++) {
                // (i-j)表示不切 memo[i-j] 表示切
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }
        return memo[n];
    }
}