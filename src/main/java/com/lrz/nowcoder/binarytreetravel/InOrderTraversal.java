package com.lrz.nowcoder.binarytreetravel;

import com.lrz.nowcoder.datatypes.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {
    public ArrayList<Integer> travel(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }
}
