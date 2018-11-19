package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/17 14:35
 */
public class BinaryTreeInorderTraversalBadExample {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);

        root1.left = root2;
        root1.right = root5;
        root2.left = root3;
        root2.right = root4;

        BinaryTreeInorderTraversalBadExample binaryTreePreorderTraversal = new BinaryTreeInorderTraversalBadExample();
        System.out.println(binaryTreePreorderTraversal.inorderTraversal(root1));
        System.out.println(root1);
    }
}
