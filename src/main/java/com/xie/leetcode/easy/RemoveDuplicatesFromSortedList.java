package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/17 0:23
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        while (second != null) {
                if (first.val == second.val) {
                if (second.next == null) {
                    first.next = null;
                    break;
                }
                second = second.next;
                continue;
            } else {
                first.next = second;
                first = second;
                second = second.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        n1.next = n3;
        n3.next = n4;

        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
        System.out.println(removeDuplicatesFromSortedList.deleteDuplicates(n1));
    }
}
