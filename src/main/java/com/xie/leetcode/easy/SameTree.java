package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/18 14:32
 */
public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        return go(p, q);
    }

    private boolean go(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return go(p.left, q.left) && go(p.right, q.right);
    }

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);

        root1.right = root2;
        root2.left = root3;

        TreeNode root4 = new TreeNode(1);
        TreeNode root5 = new TreeNode(2);
        TreeNode root6 = new TreeNode(3);

        root4.right = root5;
        root5.left = root6;

        SameTree sameTree = new SameTree();
        System.out.println(sameTree.isSameTree(root1, root4));
    }
}
