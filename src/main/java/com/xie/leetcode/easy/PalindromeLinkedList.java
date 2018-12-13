package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/12/12 18:10
 */
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        // 要实现 O(n) 的时间复杂度和 O(1) 的空间复杂度，需要翻转后半部分
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        // 根据快慢指针，找到链表的中点
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverse(slow.next);
        while(slow != null) {
            if (head.val != slow.val) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head){
        // 递归到最后一个节点，返回新的新的头结点
        if (head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(-129);
        ListNode node2 = new ListNode(-129);

        node1.next = node2;

        System.out.println(new PalindromeLinkedList().isPalindrome(node1));
    }
}