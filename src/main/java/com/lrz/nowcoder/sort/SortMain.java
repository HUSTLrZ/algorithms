package com.lrz.nowcoder.sort;

public class SortMain {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 6, 1, 56, 3, 2, 6, 34};
//        BubbleSort.sort(nums);
//        SelectionSort.sort(nums);
//        InsertionSort.sort(nums);
//        ShellSort.sort(nums);
//        MergeSort.sort(nums, 0, nums.length - 1);
//        QuickSort.sort(nums, 0, nums.length - 1);
        HeapSort.sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
