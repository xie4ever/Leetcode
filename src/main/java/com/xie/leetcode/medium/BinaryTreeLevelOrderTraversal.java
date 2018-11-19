package com.xie.leetcode.medium;

import com.xie.leetcode.struct.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xie4ever
 * @date 2018/11/18 16:03
 */
public class BinaryTreeLevelOrderTraversal {

    HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        creatLevelMap(root, 0);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (Integer i : map.keySet()) {
            result.add(map.get(i));
        }
        return result;
    }

    private void creatLevelMap(TreeNode root, int level) {
        if (root == null) {
            return;
        } else {
            List<Integer> list = map.get(level);
            if (list == null) {
                list = new ArrayList<Integer>();
                list.add(root.val);
                map.put(level, list);
            } else {
                list.add(root.val);
            }
        }
        creatLevelMap(root.left, level + 1);
        creatLevelMap(root.right, level + 1);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);

        root1.right = root2;
        root2.left = root3;
        root2.right = root4;

        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(binaryTreeLevelOrderTraversal.levelOrder(root1));
    }
}
