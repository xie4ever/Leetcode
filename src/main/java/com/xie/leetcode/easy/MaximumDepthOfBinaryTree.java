package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/15 10:22
 */
public class MaximumDepthOfBinaryTree {

    int max;

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        if (left > right) {
            max = left + 1;
        } else {
            max = right + 1;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
