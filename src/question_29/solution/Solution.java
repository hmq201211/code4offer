package question_29.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) {
            return new int[0];
        }
        final int height = (int) Math.ceil((double) matrix.length / 2);
        final int width = (int) Math.ceil((double) matrix[0].length / 2);
        final int round = Math.min(height, width);
        int[] toReturn = new int[matrix.length * matrix[0].length];
        int pointer = 0;

        for (int i = 0; i < round; i++) {
            int rowHead = i;
            int rowTail = matrix.length - 1 - i;
            int columnHead = i;
            int columnTail = matrix[0].length - 1 - i;

            if (rowHead == rowTail) {
                for (int column = columnHead; column <= columnTail; column++) {
                    toReturn[pointer++] = matrix[rowHead][column];
                }
                break;
            }
            if (columnHead == columnTail) {
                for (int row = rowHead; row <= rowTail; row++) {
                    toReturn[pointer++] = matrix[row][columnHead];
                }
                break;
            }
            for (int row = rowHead; row < rowTail; row++) {
                if (row == rowHead) {
                    for (int column = columnHead; column <= columnTail; column++) {
                        toReturn[pointer++] = matrix[row][column];
                    }
                } else {
                    toReturn[pointer++] = matrix[row][columnTail];
                }
            }
            for (int row = rowTail; row > rowHead; row--) {
                if (row == rowTail) {
                    for (int column = columnTail; column >= columnHead; column--) {
                        toReturn[pointer++] = matrix[row][column];
                    }
                } else {
                    toReturn[pointer++] = matrix[row][columnHead];
                }
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        new Solution().spiralOrder(new int[][]{
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        });
    }
}
