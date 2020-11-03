package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/19 16:17
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        if (t.left == null && t.right == null) {
            return String.valueOf(t.val);
        }

        if (t.right == null) {
            return t.val + "(" + tree2str(t.left) + ")";
        }

        return t.val + "(" +  tree2str(t.left) + ")(" + tree2str(t.right) + ")" ;
    }
}
