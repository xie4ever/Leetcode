package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/15 10:26
 */
public class SymmetricTree {

    private boolean fuck(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left==null || right == null)
            return false;
        if (left.val != right.val)
            return false;

        return fuck(left.left,right.right) && fuck(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;

        return fuck(root.left, root.right);
    }
}
