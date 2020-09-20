package question_7.solution;

import common.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0)
            return null;
        Map<Integer, Integer> indexMap = new HashMap<>();
        final int length = inorder.length;
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, length - 1, inorder, 0, length - 1, indexMap);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> indexMap) {
        if (preStart > preEnd) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[preStart]);
        if (preStart != preEnd) {
            int inorderIndex = indexMap.get(preorder[preStart]);
            int leftSize = inorderIndex - inStart;
            int rightSize = inEnd - inorderIndex;
            TreeNode left = buildTree(preorder, preStart + 1, preStart + leftSize, inorder, inStart, inorderIndex - 1, indexMap);
            TreeNode right = buildTree(preorder, preEnd - rightSize + 1, preEnd, inorder, inorderIndex + 1, inEnd, indexMap);
            treeNode.left = left;
            treeNode.right = right;
        }
        return treeNode;
    }


}