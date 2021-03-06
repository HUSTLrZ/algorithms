package com.lrz.nowcoder.solutions;

import java.util.Stack;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution11 {
    public void reOrderArray(int [] array) {
        Stack<Integer> oddStack = new Stack<>();
        Stack<Integer> evenStack = new Stack<>();
        for (int num : array) {
            if ((num & 1) == 1) {
                oddStack.push(num);
            } else {
                evenStack.push(num);
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (!evenStack.isEmpty()) {
                array[i] = evenStack.pop();
            } else {
                array[i] = oddStack.pop();
            }
        }
    }
}
