package question_27.solution;

import common.TreeNode;

public class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode treeNode = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(treeNode);
        return root;
    }
}
