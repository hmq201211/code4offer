package question_55_1.solution;

import common.TreeNode;

/**
 * @Description:
 * @Author: Mingqing Hou
 * @Create: 2020-08-26 15:40
 **/
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
