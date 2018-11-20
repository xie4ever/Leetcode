package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/19 23:03
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (sum - root.val == 0 && root.left == null && root.right == null) {
            return true;
        } else {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);

        root1.right = root2;

        PathSum pathSum = new PathSum();
        System.out.println(pathSum.hasPathSum(root1, 3));
    }
}
