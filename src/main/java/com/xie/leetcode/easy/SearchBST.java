package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2019/7/10 15:22
 */
public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }

        if (root.val == val) {
            return root;
        }

        TreeNode leftResult = searchBST(root.left, val);
        if (leftResult != null) {
            return leftResult;
        }

        TreeNode rightResult = searchBST(root.right, val);
        if (rightResult != null) {
            return rightResult;
        }

        return null;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(4);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(7);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;

        SearchBST searchBST = new SearchBST();
        System.out.println(searchBST.searchBST(treeNode1, 7));
    }
}
