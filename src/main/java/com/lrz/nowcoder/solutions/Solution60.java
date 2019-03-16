package com.lrz.nowcoder.solutions;

/**
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，
 * 但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
 * 但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Solution60 {

    public int movingCount(int threshold, int rows, int cols) {
        boolean[] index = new boolean[rows * cols];
        return movingCountHelper(threshold, rows, cols, 0, 0, index);
    }

    public int movingCountHelper(int k, int rows, int cols, int i, int j, boolean[] index) {
        if (i < 0 || i >= rows || j < 0 || j >= cols) {
            return 0;
        }
        int position = i * cols + j;
        if (index[position] || !checkSum(k, i, j)) {
            return 0;
        }
        index[position] = true;
        return 1 + movingCountHelper(k, rows, cols, i + 1, j, index)
                + movingCountHelper(k, rows, cols, i - 1, j, index)
                + movingCountHelper(k, rows, cols, i, j + 1, index)
                + movingCountHelper(k, rows, cols, i, j - 1, index);
    }

    public boolean checkSum(int threshold, int row, int col) {
        int sum = 0;
        while (row != 0) {
            sum += row % 10;
            row = row / 10;
        }
        while (col != 0) {
            sum += col % 10;
            col = col / 10;
        }
        if (sum > threshold) {
            return false;
        }
        return true;
    }
}
