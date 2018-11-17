package com.xie.leetcode.struct;

import lombok.Data;

/**
 * @author xie4ever
 * @date 2018/11/17 16:17
 */
@Data
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }
}
