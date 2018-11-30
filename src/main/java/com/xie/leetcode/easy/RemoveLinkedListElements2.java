package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/11/30 19:03
 */
public class RemoveLinkedListElements2 {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        if (head.val == val) {
            return removeElements(head.next, val);
        } else {
            head.next = removeElements(head.next, val);
            return head;
        }
    }
}
