package com.lrz.nowcoder.sort;

public class ShellSort {
    public static void sort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int len = nums.length;
        int current;
        int gap = len / 2;
        while (gap > 0) {
            for (int i = 0; i < len - gap; i++) {
                current = nums[i + gap];
                int preIndex = i;
                while (preIndex >= 0 && current < nums[preIndex]) {
                    nums[preIndex + gap] = nums[preIndex];
                    preIndex -= gap;
                }
                nums[preIndex + gap] = current;
            }
            gap /= 2;
        }
    }
}
