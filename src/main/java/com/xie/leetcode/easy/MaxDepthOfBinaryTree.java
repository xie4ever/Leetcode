package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/18 15:32
 */
public class MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return go(root);
    }

    private int go(TreeNode p) {
        int max = 0;
        if (p.left != null && p.right != null) {
            if (go(p.left) >= go(p.right)) {
                max = go(p.left);
            } else {
                max = go(p.right);
            }
        } else if (p.left != null && p.right == null) {
            max = go(p.left);
        } else if (p.left == null && p.right != null) {
            max = go(p.right);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        MaxDepthOfBinaryTree maxDepthOfBinaryTree = new MaxDepthOfBinaryTree();
        System.out.println(maxDepthOfBinaryTree.maxDepth(root1));
    }
}
