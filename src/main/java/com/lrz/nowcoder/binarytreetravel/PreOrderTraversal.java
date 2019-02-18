package com.lrz.nowcoder.binarytreetravel;

import com.lrz.nowcoder.datatypes.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {
    public ArrayList<Integer> travel(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                result.add(node.val);
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                node = node.right;
            }
        }
        return result;
    }
}
