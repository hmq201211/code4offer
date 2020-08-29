package question_7.solution;

import common.TreeNode;

import java.util.Arrays;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int index = splitTree(inorder, preorder[0], 0, inorder.length - 1);
        if (index > 0) {
            root.left = buildTree(preorder, inorder, index, index, preorder.length - index - 1, true);
            root.right = buildTree(preorder, inorder, index, index, preorder.length - index - 1, false);
        }
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder, int index, int leftTreeSize, int rightTreeSize, boolean isLeft) {
        if (size == 0)
            return null;
        if (size == 1) {
            return new TreeNode(inorder[isLeft ? index - 1 : index + 1]);
        }
        int split = splitTree(inorder, preorder[0]);
        if (index > 0) {
            root.left = buildTree(preorder, inorder, index, index, true);
            root.left = buildTree(preorder, inorder, index, preorder.length - index - 1, false);
        }
    }

    private int splitTree(int[] nums, int target, int start, int end) {
        int index = -1;
        for (int i = start; i <= end; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            }
        }
        return index;
    }
}