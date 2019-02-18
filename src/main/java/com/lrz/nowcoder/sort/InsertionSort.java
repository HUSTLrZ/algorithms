package com.lrz.nowcoder.sort;

public class InsertionSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int current;
        for (int i = 0; i < nums.length - 1; i++) {
            current = nums[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < nums[preIndex]) {
                nums[preIndex + 1] = nums[preIndex];
                preIndex--;
            }
            nums[preIndex + 1] = current;
        }
    }
}
