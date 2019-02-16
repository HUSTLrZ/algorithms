package com.lrz.nowcoder;

import com.lrz.nowcoder.datatypes.ListNode;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution13 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
