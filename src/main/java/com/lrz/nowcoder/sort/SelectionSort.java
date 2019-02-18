package com.lrz.nowcoder.sort;

public class SelectionSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            SortUtil.swap(nums, i, minIndex);
        }
    }
}
