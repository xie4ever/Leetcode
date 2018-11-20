package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/19 18:33
 */
public class BinaryBalaceTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (Math.abs(leftHeight - rightHeight) <= 1) {
            boolean l = isBalanced(root.left);
            boolean r = isBalanced(root.right);
            return l && r;
        } else {
            return false;
        }
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int height = 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        if (leftHeight >= rightHeight) {
            height = leftHeight;
        } else {
            height = rightHeight;
        }
        return height + 1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);

        root1.left = root2;
        root1.right = root5;
        root2.left = root3;
        root2.right = root4;
        root3.right = root6;

        BinaryBalaceTree binaryBalaceTree = new BinaryBalaceTree();
        System.out.println(binaryBalaceTree.isBalanced(root1));
        ;
    }
}
