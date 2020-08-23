package question_28.solution;

import common.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        return compareChildren(root.left, root.right);

    }

    public boolean compareChildren(
            TreeNode left, TreeNode right
    ) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;

        }
        if (left.val != right.val) {
            return false;
        }
        return compareChildren(left.left, right.right) && compareChildren(left.right, right.left);
    }
}
