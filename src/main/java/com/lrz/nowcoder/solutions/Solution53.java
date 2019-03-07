package com.lrz.nowcoder.solutions;

import com.lrz.nowcoder.datatypes.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Solution53 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = true;
        TreeNode node = pRoot;
        queue.offer(node);
        int size = 1;
        while (!queue.isEmpty()) {
            LinkedList<Integer> tmp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode n = queue.poll();
                if (flag) {
                    tmp.add(n.val);
                } else {
                    tmp.addFirst(n.val);
                }
                if (n.left != null) {
                    queue.offer(n.left);
                }
                if (n.right != null) {
                    queue.offer(n.right);
                }
            }
            result.add(new ArrayList<>(tmp));
            size = queue.size();
            flag = !flag;
        }
        return result;
    }
}
