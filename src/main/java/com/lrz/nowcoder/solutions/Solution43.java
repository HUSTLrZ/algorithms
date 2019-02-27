package com.lrz.nowcoder.solutions;

/**
 * 翻转字符串
 */
public class Solution43 {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0 || str.trim().equals("")) {
            return str;
        }
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]);
            if (i >= 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
