package question_32_2.solution;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<List<TreeNode>> queue = new LinkedList<>();
        List<List<Integer>> toReturn = new ArrayList<>();
        List<TreeNode> list = new ArrayList<>();
        list.add(root);
        queue.add(list);
        while (queue.size() != 0) {
            List<TreeNode> poll = queue.poll();
            List<Integer> temp = new ArrayList<>();
            List<TreeNode> level = new ArrayList<>();
            for (TreeNode treeNode : poll) {
                if (treeNode != null) {
                    temp.add(treeNode.val);
                    level.add(treeNode.left);
                    level.add(treeNode.right);
                }
            }
            if (temp.size() != 0) {
                queue.add(level);
            }
            if (temp.size() != 0) {
                toReturn.add(temp);
            }
        }
        return toReturn;
    }
}
