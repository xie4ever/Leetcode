package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/12/4 19:10
 */
public class ReverseLinkedList {

    Stack<ListNode> stack = new Stack<ListNode>();

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next != null) {
            stack.push(head);
            return reverseList(head.next);
        } else {
            ListNode h = head;
            while (!stack.empty()) {
                h.next = stack.pop();
                h = h.next;
            }
            h.next = null;

            return head;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        System.out.println(reverseLinkedList.reverseList(node1));
    }
}
