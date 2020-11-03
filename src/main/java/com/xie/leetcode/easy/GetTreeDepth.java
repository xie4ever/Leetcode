package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/11/14 16:27
 */
public class GetTreeDepth {

    int max = 0;

    public int depth(TreeNode root) {
        if (root == null) {
            return -1;
        }

        int left = depth(root.left);
        int right = depth(root.right);

        if (left > right) {
            max = left + 1;
        } else {
            max = right + 1;
        }

        return max;
    }


    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);


        node1.left = node2;
        node1.right = node3;

        node2.left = node4;
        node2.right = node5;

        node5.left = node6;
        node5.right = node7;

        System.out.println(new GetTreeDepth().depth(node1));
    }
}