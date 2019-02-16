package com.lrz.nowcoder;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * (n-1)&n表示把n的最后一个1变成0
 */
public class Solution9 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
