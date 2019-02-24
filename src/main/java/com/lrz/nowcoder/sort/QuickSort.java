package com.lrz.nowcoder.sort;

public class QuickSort {
    public static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }

        int key = partition2(nums, low, high);
        sort(nums, low, key - 1);
        sort(nums, key + 1, high);
    }

    private static int partition1(int[] nums, int lo, int hi) {
        int pivot = nums[lo];
        while (lo < hi) {
            while (lo < hi && nums[hi] >= pivot) {
                hi--;
            }
            nums[lo] = nums[hi];
            while (lo < hi && nums[lo] <= pivot) {
                lo++;
            }
            nums[hi] = nums[lo];
        }
        nums[hi] = pivot;
        return hi;
    }

    private static int partition2(int[] nums, int lo, int hi) {
        //三数取中
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] > nums[hi]) {
            swap(nums, mid, hi);
        }
        if (nums[lo] > nums[hi]) {
            swap(nums, lo, hi);
        }
        if (nums[mid] > nums[lo]) {
            swap(nums, mid, lo);
        }
        int pivot = nums[lo];

        while (lo < hi) {
            while (lo < hi && nums[hi] >= pivot) {
                hi--;
            }
            nums[lo] = nums[hi];
            while (lo < hi && nums[lo] <= pivot) {
                lo++;
            }
            nums[hi] = nums[lo];
        }
        nums[hi] = pivot;
        return hi;
    }

    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
