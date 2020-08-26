package question_54.solution;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public int kthLargest(TreeNode root, int k) {
        List<TreeNode> treeNodes = inOrderTraverse(root);
        return treeNodes.get(treeNodes.size() - k).val;
    }

    private List<TreeNode> inOrderTraverse(TreeNode root) {
        List<TreeNode> toReturn = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (stack.peek().left != null) {
            stack.push(stack.peek().left);
        }
        while (!stack.isEmpty()) {
            TreeNode pop = stack.pop();
            toReturn.add(pop);
            if (pop.right != null) {
                TreeNode temp = pop.right;
                stack.push(temp);
                while (temp.left != null) {
                    stack.push(temp.left);
                    temp = temp.left;
                }
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(new Solution().kthLargest(root, 1));
    }
}