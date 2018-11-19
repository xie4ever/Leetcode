package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/18 15:32
 */
public class MaxDepthOfBinaryTree3 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        MaxDepthOfBinaryTree3 maxDepthOfBinaryTree = new MaxDepthOfBinaryTree3();
        System.out.println(maxDepthOfBinaryTree.maxDepth(root1));
    }
}
