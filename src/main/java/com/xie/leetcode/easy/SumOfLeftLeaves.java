package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/12/20 16:32
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        int i = 0;
        if (root == null) {
            return i;
        }
        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                i = i + root.left.val;
            } else {
                i = i + sumOfLeftLeaves(root.left);
            }
        }
        if (root.right != null) {
            i = i + sumOfLeftLeaves(root.right);
        }
        return i;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        System.out.println(new SumOfLeftLeaves().sumOfLeftLeaves(node1));
    }
}
