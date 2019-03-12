package com.lrz.nowcoder.solutions;

import com.lrz.nowcoder.datatypes.TreeNode;

/**
 * 请实现两个函数，分别用来序列化和反序列化二叉树
 */
public class Solution55 {
    int index;

    String Serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            sb.append("#,");
            return sb.toString();
        }
        sb.append(root.val + ",");
        sb.append(Serialize(root.left));
        sb.append(Serialize(root.right));
        return sb.toString();
    }

    TreeNode Deserialize(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        index = -1;
        String[] strs = str.split(",");
        return deserialize(strs);
    }

    TreeNode deserialize(String[] str) {
        index++;
        TreeNode node = null;
        if (!str[index].equals("#")) {
            node = new TreeNode(Integer.parseInt(str[index]));
            node.left = deserialize(str);
            node.right = deserialize(str);
        }
        return node;
    }
}
