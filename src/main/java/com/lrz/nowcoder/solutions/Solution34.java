package com.lrz.nowcoder.solutions;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 * 归并
 */
public class Solution34 {
    public static int InversePairs(int[] array) {
        return inverse(array, 0, array.length - 1);
    }

    private static int inverse(int[] num, int low, int high) {
        if (low >= high) {
            return 0;
        }
        int mid = (low + high) >> 1;
        int leftCount = inverse(num, low, mid);
        int rightCount = inverse(num, mid + 1, high);
        int count = mergeCount(num, low, mid, high);
        return (leftCount + rightCount + count) % 1000000007;
    }

    private static int mergeCount(int[] num, int low, int mid, int high) {
        int[] copyNum = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int count = 0;
        int index = 0;
        while (i <= mid && j <= high) {
            if (num[i] < num[j]) {
                copyNum[index++] = num[i++];
            } else {
                count = (count + mid - i + 1) % 1000000007;
                copyNum[index++] = num[j++];
            }
        }
        while (i <= mid) {
            copyNum[index++] = num[i++];
        }
        while (j <= high) {
            copyNum[index++] = num[j++];
        }
        for (int s = low; s <= high; s++) {
            num[s] = copyNum[s - low];
        }
        return count % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(InversePairs(new int[]{1, 2, 3, 4, 5, 6, 7, 0}));
    }
}
