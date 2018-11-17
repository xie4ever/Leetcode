package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/11/13 23:53
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode first = new ListNode(0);
        ListNode current = first;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                current.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            current = current.next;

            if (l1 == null) {
                current.next = l2;
            } else {
                current.next = l1;
            }
        }

        return first.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        n1.next = n3;
        n3.next = n5;

        ListNode n2 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        n2.next = n4;

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        System.out.println(mergeTwoSortedLists.mergeTwoLists(n1, n2));
    }
}
