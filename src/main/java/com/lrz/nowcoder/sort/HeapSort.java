package com.lrz.nowcoder.sort;

public class HeapSort {
    private static int len;

    public static void sort(int[] nums) {
        len = nums.length;
        if (len <= 1) {
            return;
        }
        buildMaxHeap(nums);
        while (len > 0) {
            swap(nums, 0, len - 1);
            len--;
            adjustHeap(nums, 0);
        }
    }

    private static void buildMaxHeap(int[] nums) {
        for (int i = len / 2 - 1; i >= 0; i--) {
            adjustHeap(nums, i);
        }
    }

    private static void adjustHeap(int[] nums, int i) {
        int maxIndex = i;
        if (i * 2 < len && nums[maxIndex] < nums[i * 2]) {
            maxIndex = i * 2;
        }
        if (i * 2 + 1 < len && nums[maxIndex] < nums[i * 2 + 1]) {
            maxIndex = i * 2 + 1;
        }
        if (maxIndex != i) {
            swap(nums, maxIndex, i);
            adjustHeap(nums, maxIndex);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
