package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/14 14:51
 */
public class DiameterOfBinaryTree {

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            setDepth(root);
            return max;
        }
        return 0;
    }

    public int setDepth(TreeNode root) {
        if (root != null) {
            int right = setDepth(root.right);
            int left = setDepth(root.left);
            if (right + left > max)
                max = right + left;
            return Math.max(right, left) + 1;
        }
        return 0;
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

        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(node1));
    }
}
