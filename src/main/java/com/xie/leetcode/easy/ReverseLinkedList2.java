package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/12/4 19:10
 */
public class ReverseLinkedList2 {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseLinkedList2 reverseLinkedList = new ReverseLinkedList2();
        System.out.println(reverseLinkedList.reverseList(node1));
    }
}
