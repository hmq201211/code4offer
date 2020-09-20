package question_12.solutilon;

public class Solution {
    public boolean exist(char[][] board, String word) {
        char[] target = word.toCharArray();
        final int height = board.length;
        if (height == 0 || board[0] == null)
            return false;
        final int weight = board[0].length;
        if (weight == 0)
            return false;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (dfs(board, i, j, target, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, int i, int j, char[] target, int index) {
        if (i >= board.length || i < 0 || j >= board[0].length || j < 0)
            return false;
        if (board[i][j] != target[index])
            return false;
        if (index == target.length - 1)
            return true;
        char temp = board[i][j];
        board[i][j] = ' ';
        boolean found = dfs(board, i + 1, j, target, index + 1) ||
                dfs(board, i, j + 1, target, index + 1) ||
                dfs(board, i - 1, j, target, index + 1) ||
                dfs(board, i, j - 1, target, index + 1);
        board[i][j] = temp;
        return found;
    }
}
