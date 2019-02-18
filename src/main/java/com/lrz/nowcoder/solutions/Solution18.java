package com.lrz.nowcoder.solutions;

import java.util.ArrayList;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class Solution18 {
    ArrayList<Integer> dataList = new ArrayList<>();
    ArrayList<Integer> minList = new ArrayList<>();
    private int min = Integer.MAX_VALUE;

    public void push(int node) {
        dataList.add(node);

        if (node <= min) {
            minList.add(node);
            min = node;
        } else {
            minList.add(min);
        }
    }

    public void pop() {
        int end = dataList.size() - 1;
        dataList.remove(end);
        minList.remove(end);
        min = minList.get(end - 1);
    }

    public int top() {
        return dataList.get(dataList.size() - 1);
    }

    public int min() {
        return min;
    }
}
