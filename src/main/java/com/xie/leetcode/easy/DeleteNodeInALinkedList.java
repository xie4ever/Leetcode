package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/12/12 18:46
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }
}
