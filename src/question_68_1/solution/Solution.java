package question_68_1.solution;

import common.TreeNode;

import javax.swing.*;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-28 15:15
 **/
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q)
            return root;
        if (root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return root;
    }
}
