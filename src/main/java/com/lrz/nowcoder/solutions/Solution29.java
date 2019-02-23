package com.lrz.nowcoder.solutions;

/**
 * 1到n中1出现的个数
 */
public class Solution29 {
    public int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            count += (a + 8) / 10 * i;
            if (a % 10 == 1) {
                count += b + 1;
            }
        }
        return count;
    }
}
