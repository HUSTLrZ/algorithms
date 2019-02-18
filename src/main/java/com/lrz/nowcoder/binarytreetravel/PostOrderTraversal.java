package com.lrz.nowcoder.binarytreetravel;

import com.lrz.nowcoder.datatypes.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal {
    public ArrayList<Integer> travel(TreeNode root) {
        if (root == null) {
            return null;
        }
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        TreeNode p = root;
        while (p != null || !s1.isEmpty()) {
            if (p != null) {
                s1.push(p);
                s2.push(p);
                p = p.right;
            } else {
                p = s1.pop();
                p = p.left;
            }
        }

        while (!s2.isEmpty()) {
            result.add(s2.pop().val);
        }
        return result;
    }
}
