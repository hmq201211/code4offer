package question_68_2.solution;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    public Stack<TreeNode> findPath(TreeNode treeNode, TreeNode target) {
        if (treeNode == null)
            return null;
        Stack<TreeNode> stack = new Stack<>();
        recursiveSearch(treeNode, target, stack);
        return stack;
    }

    private boolean recursiveSearch(TreeNode treeNode, TreeNode target, Stack<TreeNode> stack) {
        if (treeNode == null)
            return false;
        if (treeNode == target) {
            stack.push(treeNode);
            return true;
        } else {
            stack.push(treeNode);
            boolean left = recursiveSearch(treeNode.left, target, stack);
            if (left) {
                return true;
            }
            boolean right = recursiveSearch(treeNode.right, target, stack);
            if (right) {
                return true;
            }
            stack.pop();
            return false;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode left_left = new TreeNode(4);
        TreeNode right_right = new TreeNode(5);
        treeNode.left = left;
        treeNode.right = right;
        left.left = left_left;
        right.right = right_right;
        Stack<TreeNode> path = new Solution().findPath(treeNode, left_left);
        System.out.println(path);
    }
}
