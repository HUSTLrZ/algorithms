package com.lrz.nowcoder.sort;

public class MergeSort {
    public static void sort(int[] nums, int low, int high) {
        int mid = (high - low) / 2 + low;
        if (low < high) {
            sort(nums, low, mid);
            sort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    private static void merge(int[] nums, int low, int mid, int high) {
        int[] tmp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                tmp[index++] = nums[i++];
            } else {
                tmp[index++] = nums[j++];
            }
        }
        while (i <= mid) {
            tmp[index++] = nums[i++];
        }
        while (j <= high) {
            tmp[index++] = nums[j++];
        }
        for (int k = 0; k < tmp.length; k++) {
            nums[k + low] = tmp[k];
        }
    }
}
