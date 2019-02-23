package com.lrz.nowcoder.solutions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class Solution32 {
    public static int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            map.merge(c, 1, (a, b) -> a + b);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return str.indexOf(""+entry.getKey());
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
