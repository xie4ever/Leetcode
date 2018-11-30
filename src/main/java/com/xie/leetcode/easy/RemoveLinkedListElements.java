package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/11/30 19:03
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }
}
