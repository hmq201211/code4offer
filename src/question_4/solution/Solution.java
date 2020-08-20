package question_4.solution;

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        final int height = matrix.length;
        int x = 0;
        int y = matrix[0].length - 1;
        while (x < height && y >= 0) {
            if (matrix[x][y] == target)
                return true;
            else {
                if (matrix[x][y] > target) {
                    y--;
                } else {
                    x++;
                }
            }
        }
        return false;
    }
}