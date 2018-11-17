package com.xie.leetcode.struct;

import lombok.Data;

/**
 * @author xie4ever
 * @date 2018/11/17 16:20
 */
@Data
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int x) { val = x; }
}
