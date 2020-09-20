package question_13.solution;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    final int deny = -1;
    final int pass = 1;
    final int compute = 0;

    private static class Index {
        public int x;
        public int y;

        public Index(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int movingCount(int m, int n, int k) {
        int[][] memo = new int[m][n];
        if (k < 0)
            return 0;
        Queue<Index> queue = new LinkedList<>();
        queue.add(new Index(0, 0));
        while (!queue.isEmpty()) {
            Index index = queue.poll();
            if (memo[index.x][index.y] == compute) {
                int sum = sum(index.x) + sum(index.y);
                if (sum <= k) {
                    memo[index.x][index.y] = pass;
                    if (index.x - 1 >= 0) {
                        if (memo[index.x - 1][index.y] == compute) {
                            queue.add(new Index(index.x - 1, index.y));
                        }
                    }
                    if (index.x + 1 < m) {
                        if (memo[index.x + 1][index.y] == compute) {
                            queue.add(new Index(index.x + 1, index.y));
                        }
                    }
                    if (index.y - 1 >= 0) {
                        if (memo[index.x][index.y - 1] == compute) {
                            queue.add(new Index(index.x, index.y - 1));
                        }
                    }
                    if (index.y + 1 < n) {
                        if (memo[index.x][index.y + 1] == compute) {
                            queue.add(new Index(index.x, index.y + 1));
                        }
                    }
                } else {
                    memo[index.x][index.y] = deny;
                }
            }
        }
        int toReturn = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (memo[i][j] == pass)
                    toReturn++;
            }
        }
        return toReturn;
    }

    private int sum(int target) {
        int sum = 0;
        while (target >= 10) {
            sum += target % 10;
            target /= 10;
        }
        sum += target;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().sum(111));
    }
}