package question_54.solution;

import common.TreeNode;

public class Solution {
    public int kthLargest(TreeNode root, int k) {
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }
}