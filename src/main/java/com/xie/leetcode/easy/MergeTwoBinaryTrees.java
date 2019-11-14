package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/14 14:36
 */
public class MergeTwoBinaryTrees {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 != null && t2 != null) {

            TreeNode result = new TreeNode(t1.val + t2.val);
            result.left = mergeTrees(t1.left, t2.left);
            result.right = mergeTrees(t1.right, t2.right);

            return result;
        } else if (t2 == null) {
            return t1;
        } else if (t1 == null) {
            return t2;
        } else {
            return null;
        }
    }
}
