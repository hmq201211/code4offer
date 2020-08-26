package question_55_2.solution;

import common.TreeNode;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-26 15:41
 **/
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        return isBalanced(root.left) && isBalanced(root.right) && Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;

    }

    private int maxDepth(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        return Math.max(maxDepth(treeNode.left), maxDepth(treeNode.right)) + 1;
    }
}
