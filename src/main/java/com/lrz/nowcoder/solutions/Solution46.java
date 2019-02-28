package com.lrz.nowcoder.solutions;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class Solution46 {
    public int StrToInt(String str) {
        if (str == null || str.trim().equals("")) {
            return 0;
        }
        char[] arr = str.toCharArray();
        int symbol = 0;
        int start = 0;
        if (arr[0] == '+') {
            start = 1;
        }
        if (arr[0] == '-') {
            start = 1;
            symbol = 1;
        }
        int result = 0;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] > '9' || arr[i] < '0') {
                return 0;
            }
            result = result * 10 + arr[i] - '0';
        }
        return symbol == 1 ? -result : result;
    }
}
