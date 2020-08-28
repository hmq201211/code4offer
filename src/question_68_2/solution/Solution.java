package question_68_2.solution;

import common.TreeNode;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-28 15:36
 **/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || p == root || q == root)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        if (left != null)
            return left;
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (right != null)
            return right;
        return root;

    }
}
