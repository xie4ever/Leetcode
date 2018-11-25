package com.xie.leetcode.easy;

import com.xie.leetcode.struct.ListNode;

/**
 * @author xie4ever
 * @date 2018/11/23 19:15
 */
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        if (headA == headB) {
            return headA;
        }

        ListNode lastNodeA = headA;
        ListNode lastNodeB = headB;
        int lengthA = 0;
        int lengthB = 0;
        while (lastNodeA != null) {
            if (lastNodeA.next != null) {
                lastNodeA = lastNodeA.next;
                lengthA++;
            } else {
                lastNodeA = lastNodeA;
                lengthA++;
                break;
            }
        }

        while (lastNodeB != null) {
            if (lastNodeB.next != null) {
                lastNodeB = lastNodeB.next;
                lengthB++;
            } else {
                lastNodeB = lastNodeB;
                lengthB++;
                break;
            }
        }

        if (lastNodeA == lastNodeB) {
            if (lengthA > lengthB) {
                for (int i = 0; i < lengthA - lengthB; i++) {
                    headA = headA.next;
                }
            } else {
                for (int i = 0; i < lengthB - lengthA; i++) {
                    headB = headB.next;
                }
            }
            while (headA != headB) {
                headA = headA.next;
                headB = headB.next;
            }
            return headA;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);

        listNode1.next = listNode2;
        listNode2.next = listNode4;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
        System.out.println(intersectionOfTwoLinkedLists.getIntersectionNode(listNode1, listNode2));
    }
}
