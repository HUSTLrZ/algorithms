package com.lrz.nowcoder.solutions;

import java.util.ArrayList;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 小根堆
 */
public class Solution27 {


    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || input.length < k) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = k / 2 - 1; i >= 0; i--) {
            adjustHeap(input, i, k);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < input[0]) {
                swap(input, i, 0);
                adjustHeap(input, 0, k);
            }
        }
        for (int i = 0; i < k; i++) {
            result.add(input[i]);
        }
        return result;
    }

    private void buildMaxHeap(int[] input, int k) {
        for (int i = k / 2 - 1; i >= 0; i--) {
            adjustHeap(input, i, k - 1);
        }
    }

    private void adjustHeap(int[] input, int position, int len) {
        int tmp = input[position];
        int child = 2 * position + 1;
        for (; child < len; child = 2 * child + 1) {
            if (child + 1 < len && input[child] < input[child + 1]) {
                child++;
            }
            if (tmp > input[child]) {
                break;
            }
            input[position] = input[child];
            position = child;
        }
        input[position] = tmp;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        Solution27 s = new Solution27();
        ArrayList<Integer> result = s.GetLeastNumbers_Solution(input, 4);
        for (int num : result) {
            System.out.println(num);
        }
    }

    private void swap(int[] input, int i, int j) {
        int tmp = input[i];
        input[i] = input[j];
        input[j] = tmp;
    }
}
