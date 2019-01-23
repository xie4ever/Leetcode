package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/12/22 11:38
 */
public class PathSum3 {

    private int i = 0;

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        go(root, sum);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return i;
    }

    public void go(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum = sum - root.val;
        if (sum == 0) {
            i++;
        }
        go(root.left, sum);
        go(root.right, sum);
    }
}