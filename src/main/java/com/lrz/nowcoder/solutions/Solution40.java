package com.lrz.nowcoder.solutions;

import java.util.ArrayList;
import java.util.Collections;

public class Solution40 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum <= 1) {
            return result;
        }
        int low = sum - 1;
        int high = sum;
        while (low > 0) {
            int tmp = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for ( int i = low; i <= high; i++) {
                tmp += i;
                list.add(i);
            }
            if (tmp > sum) {
                low--;
                high--;
            }
            if (tmp < sum) {
                low--;
            }
            if (tmp == sum) {
                result.add(list);
                low -= 2;
                high--;
            }
        }
        Collections.reverse(result);
        return result;
    }
}
