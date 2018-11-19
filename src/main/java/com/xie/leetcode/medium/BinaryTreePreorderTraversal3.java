package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author xie4ever
 * @date 2018/11/18 23:38
 */
public class BinaryTreePreorderTraversal3 {

    HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

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
            if (left != null && map.get(left.hashCode()) == null) {
                map.put(left.hashCode(), true);
                result.add(left.val);
                stack.push(left);
            } else if (right != null && map.get(right.hashCode()) == null) {
                map.put(right.hashCode(), true);
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

        BinaryTreePreorderTraversal3 binaryTreePreorderTraversal = new BinaryTreePreorderTraversal3();
        System.out.println(binaryTreePreorderTraversal.preorderTraversal(root1));
        System.out.println(root1);
    }
}
