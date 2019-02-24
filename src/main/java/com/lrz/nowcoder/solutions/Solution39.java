package com.lrz.nowcoder.solutions;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。
 */
public class Solution39 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            tmp ^= array[i];
        }
        int index = findFirstBit(tmp);
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i], index)) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }
    }

    private int findFirstBit(int num) {
        int index = 0;
        while ((num & 1) != 1 && index < 32) {
            num = num >> 1;
            index++;
        }
        return index;
    }

    private boolean isBit(int num, int index) {
        num = num >> index;
        return (num & 1) == 1;
    }
}
