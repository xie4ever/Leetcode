package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/12/13 18:05
 */
public class BinaryTreePaths {

    private List<String> list = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return list;
        }

        go("", root);

        return list;
    }

    private void go(String s, TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                s = s + root.val;
                list.add(s);
                return;
            }
            s = s + root.val + "->";
            go(s, root.left);
            go(s, root.right);
        } else {
            return;
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(5);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.right = treeNode5;

        List<String> list = new BinaryTreePaths().binaryTreePaths(treeNode1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
