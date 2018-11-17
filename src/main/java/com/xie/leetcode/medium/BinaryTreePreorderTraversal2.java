package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/11/17 16:28
 */
public class BinaryTreePreorderTraversal2 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        result.add(root.val);
        while (stack.size() != 0) {
            TreeNode left = stack.peek().left;
            TreeNode right = stack.peek().right;
            if (left != null) {
                stack.peek().left = null;
                result.add(left.val);
                stack.push(left);
            } else if (right != null) {
                stack.peek().right = null;
                result.add(right.val);
                stack.push(right);
            } else {
                stack.pop();
            }
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

        BinaryTreePreorderTraversal2 binaryTreePreorderTraversal2 = new BinaryTreePreorderTraversal2();
        System.out.println(binaryTreePreorderTraversal2.preorderTraversal(root1));
    }
}
