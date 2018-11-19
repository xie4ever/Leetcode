package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/18 15:21
 */
public class SymmetircTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return go(root.left, root.right);
    }

    public boolean go(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return go(p.left, q.right) && go(p.right, q.left);
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        SymmetircTree symmetircTree = new SymmetircTree();
        System.out.println(symmetircTree.isSymmetric(root1));
    }
}
