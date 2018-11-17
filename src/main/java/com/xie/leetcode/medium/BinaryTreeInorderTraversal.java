package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/17 14:35
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }
        find(root, result);
        return result;
    }

    public void find(TreeNode root , List<Integer> result) {
        if (root == null) {
            return;
        }
        find(root.left, result);
        result.add(root.val);
        find(root.right, result);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        binaryTreeInorderTraversal.inorderTraversal(root1);
        System.out.println(root1);
    }
}
