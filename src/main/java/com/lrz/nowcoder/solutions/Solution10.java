package com.lrz.nowcoder.solutions;

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */
public class Solution10 {
    public double Power(double base, int exponent) {
        int res = 1;
        int n = exponent;
        if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("IllegalArgument!");
            }
            exponent = -exponent;
        }
        if (exponent == 0) {
            return 1;
        }
        for (int i = 0;i < exponent; i++) {
            res *= base;
        }
        return n > 0 ? res : 1.0 / res;
    }
}
