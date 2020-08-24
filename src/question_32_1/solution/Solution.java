package question_32_1.solution;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> toReturn = new ArrayList<>();
        queue.add(root);
        while (queue.size() != 0) {
            TreeNode treeNode = queue.poll();
            if (treeNode != null) {
                queue.add(treeNode.left);
                queue.add(treeNode.right);
                toReturn.add(treeNode.val);
            }
        }
        int[] result = new int[toReturn.size()];
        for (int i = 0; i < toReturn.size(); i++) {
            result[i] = toReturn.get(i);
        }
        return result;
    }
}
