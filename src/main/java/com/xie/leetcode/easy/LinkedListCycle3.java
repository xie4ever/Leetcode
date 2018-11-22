package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/11/22 23:41
 */
public class LinkedListCycle3 {

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        boolean flag = false;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = true;
                break;
            }
        }

        ListNode begin = head;
        if (flag) {
            while (begin != slow) {
                begin = begin.next;
                slow = slow.next;
            }
            return begin;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycle3 linkedListCycle = new LinkedListCycle3();
        linkedListCycle.detectCycle(node1);
    }
}
