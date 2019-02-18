package com.lrz.nowcoder.sort;

public class BubbleSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    SortUtil.swap(nums, j, j + 1);
                }
            }
        }
    }
}
