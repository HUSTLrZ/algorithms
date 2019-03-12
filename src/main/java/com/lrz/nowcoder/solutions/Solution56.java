package com.lrz.nowcoder.solutions;

import com.lrz.nowcoder.datatypes.TreeNode;

import java.util.Stack;

/**
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。例如， （5，3，7，2，4，6，8）    中，按结点数值大小顺序第三小结点的值为4。
 */
public class Solution56 {
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        int count = 0;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                TreeNode result = stack.pop();
                count++;
                if (count == k) {
                    return result;
                }
                node = result.right;
            }
        }
        return null;
    }
}
