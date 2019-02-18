package com.lrz.nowcoder.solutions;

import com.lrz.nowcoder.datatypes.ListNode;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution12 {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }
        ListNode pre = head;
        for (int i = 1; i < k; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else {
                return null;
            }
        }
        while (pre.next != null) {
            pre = pre.next;
            head = head.next;
        }
        return head;
    }
}
