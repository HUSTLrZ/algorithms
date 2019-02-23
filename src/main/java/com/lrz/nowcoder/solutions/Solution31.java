package com.lrz.nowcoder.solutions;

import java.util.ArrayList;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class Solution31 {
    public static int GetUglyNumber_Solution(int index) {
        if (index < 7) {
            return index;
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int t1 = 0, t2 = 0, t3 = 0;
        while (index - 1 > 0) {
            int min = Math.min(list.get(t1) * 2, Math.min(list.get(t2) * 3, list.get(t3) * 5));
            list.add(min);
            if (min == list.get(t1) * 2) {
                t1++;
            }
            if (min == list.get(t2) * 3) {
                t2++;
            }
            if (min == list.get(t3) * 5) {
                t3++;
            }
            index--;
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(14));
    }
}
