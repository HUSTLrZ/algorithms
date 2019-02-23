package com.lrz.nowcoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
 */
public class Solution33 {
    public static int InversePairs(int [] array) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        for (int i = 1;i < array.length;i++) {
            if (array[i] < array[i - 1]) {
                list.add(list.get(i - 1) + 1);
            }
            if (array[i] == array[i - 1]) {
                list.add(list.get(i - 1));
            }
            if (array[i] > array[i - 1]) {
                int index = i - 1;
                while (index > 0 && array[i] >= array[index]) {
                    index--;
                }
                list.add(list.get(index) + 1);
            }
        }
        int count = 0;
        for (int num : list) {
            count += num;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(InversePairs(new int[] {1,2,3,4,5,6,7,0}));
    }
}
