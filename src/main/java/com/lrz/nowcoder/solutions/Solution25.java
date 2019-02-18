package com.lrz.nowcoder.solutions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 回溯法
 */
public class Solution25 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null) {
            return result;
        }
        permutationHelper(str.toCharArray(), 0, result);
        Collections.sort(result);
        return result;
    }

    private void permutationHelper(char[] charArr, int start, ArrayList<String> result) {
        if (start == charArr.length - 1) {
            String str = String.valueOf(charArr);
            if (!result.contains(str)) {
                result.add(str);
            }
            return;
        }
        for (int i = start;i < charArr.length; i++) {
            swap(charArr, start, i);
            permutationHelper(charArr, start + 1, result);
            swap(charArr, i, start);
        }
    }

    private void swap(char[] charArr, int i, int j) {
        char tmp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = tmp;
    }
}
