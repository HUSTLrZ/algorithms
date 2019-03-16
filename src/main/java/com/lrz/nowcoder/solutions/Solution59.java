package com.lrz.nowcoder.solutions;

/**
 * 请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则之后不能再次进入这个格子。
 * 例如 a b c e s f c s a d e e 这样的3 X 4 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，
 * 因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class Solution59 {

    private int len = 0;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0 || str == null || str.length == 0 || matrix.length != rows * cols || rows <= 0 || cols <= 0 || rows * cols < str.length) {
            return false;
        }

        boolean[] index = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (hasPathHelper(matrix, rows, cols, i, j, str, index)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasPathHelper(char[] matrix, int rows, int cols, int i, int j, char[] str, boolean[] index) {
        boolean flag = false;

        if (i >= 0 && i < rows && j >= 0 && j < cols && !index[i * cols + j] && matrix[i * cols + j] == str[len]) {
            len++;
            index[i * cols + j] = true;
            if (len == str.length) {
                return true;
            }
            flag = hasPathHelper(matrix, rows, cols, i + 1, j, str, index)
                    || hasPathHelper(matrix, rows, cols, i - 1, j, str, index)
                    || hasPathHelper(matrix, rows, cols, i, j + 1, str, index)
                    || hasPathHelper(matrix, rows, cols, i, j - 1, str, index);
            if (!flag) {
                len--;
                index[i * cols + j] = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        char[] matric = new char[]{'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'};
        char[] str = new char[]{'A', 'B', 'C', 'C', 'E', 'D'};
        boolean flag =  solution59.hasPath(matric, 3, 4, str);
        return;
    }
}
