package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/19 22:30
 */
public class MinimumDepthOfBinaryTree {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.right == null && root.left != null) {
            return minDepth(root.left) + 1;
        } else if (root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        } else {
            int leftHight = minDepth(root.left);
            int rightHight = minDepth(root.right);
            if (leftHight <= rightHight) {
                return leftHight + 1;
            } else {
                return rightHight + 1;
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        root1.right = root2;
        root2.left = root3;
        root2.right = root4;
        root3.right = root5;
        root4.right = root6;

        MinimumDepthOfBinaryTree minimumDepthOfBinaryTree = new MinimumDepthOfBinaryTree();
        System.out.println(minimumDepthOfBinaryTree.minDepth(root1));
    }
}
