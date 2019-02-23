package com.lrz.nowcoder.solutions;

/**
 * 连续子数组最大和
 * 动态规划
 */
public class Solution28 {
    public int FindGreatestSumOfSubArray(int[] array) {
        int result = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            result = Math.max(result, max);
        }
        return result;
    }
}
