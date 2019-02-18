package com.lrz.nowcoder.solutions;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 解法1：遍历每行，二分查找，时间复杂度O(nlogn)
 * 解法2：由左下角往右上角移动查找，时间复杂度O(n)
 */
public class Solution1 {

    public boolean Find(int target, int[][] array) {
        boolean flag = false;
        for (int[] arr : array) {
            if (contains(target, arr)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    private boolean contains(int target, int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int a = (j - i) / 2 + i;
            if (nums[a] == target) {
                return true;
            }
            if (nums[a] < target) {
                i = a + 1;
            }
            if (nums[a] > target) {
                j = a - 1;
            }
        }
        return false;
    }
}
