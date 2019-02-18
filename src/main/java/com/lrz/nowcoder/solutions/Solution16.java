package com.lrz.nowcoder.solutions;

import com.lrz.nowcoder.datatypes.TreeNode;

/**
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Solution16 {
    public void Mirror(TreeNode root) {
        if (root == null || root.left == null && root.right == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
