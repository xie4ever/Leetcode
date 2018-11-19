package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/11/17 14:35
 */
public class BinaryTreeInorderTraversal2 {

    HashMap<Integer, Boolean> pass = new HashMap<Integer, Boolean>();
    HashMap<Integer, Boolean> add = new HashMap<Integer, Boolean>();

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (stack.size() != 0) {
            TreeNode left = stack.peek().left;
            TreeNode right = stack.peek().right;
            if (left == null && right == null) {
                pass.put(stack.peek().hashCode(), true);
                add.put(stack.peek().hashCode(), true);
                result.add(stack.peek().val);
                stack.pop();
            } else if (left == null && add.get(stack.peek().hashCode()) == null) {
                add.put(stack.peek().hashCode(), true);
                result.add(stack.peek().val);
            } else if (left != null && pass.get(left.hashCode()) == null) {
                pass.put(stack.peek().hashCode(), true);
                stack.push(left);
            } else if (left != null && add.get(left.hashCode()) != null && add.get(stack.peek().hashCode()) == null) {
                add.put(stack.peek().hashCode(), true);
                result.add(stack.peek().val);
            } else if (right != null && pass.get(right.hashCode()) == null) {
                pass.put(right.hashCode(), true);
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

        BinaryTreeInorderTraversal2 binaryTreeInorderTraversal = new BinaryTreeInorderTraversal2();
        System.out.println(binaryTreeInorderTraversal.inorderTraversal(root1));
        ;
        System.out.println(root1);
    }
}
