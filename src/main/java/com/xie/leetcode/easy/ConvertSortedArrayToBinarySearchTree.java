package com.xie.leetcode.easy;

import com.xie.leetcode.struct.TreeNode;

/**
 * @author xie4ever
 * @date 2018/11/19 17:57
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return go(nums, 0, nums.length - 1);
    }

    public TreeNode go(int[] nums, int left, int right) {
        // 因为是排序数组，一旦右小于左，肯定是有问题
        if (right < left) {
            return null;
        }
        // 相等，直接结束
        if (left == right) {
            return new TreeNode(nums[left]);
        }
        int middle = (right + left) / 2;

        TreeNode root = new TreeNode(nums[middle]);
        root.left = go(nums, left, middle - 1);
        root.right = go(nums, middle + 1, right);

        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        ConvertSortedArrayToBinarySearchTree convertSortedArrayToBinarySearchTree = new ConvertSortedArrayToBinarySearchTree();
        System.out.println(convertSortedArrayToBinarySearchTree.sortedArrayToBST(nums));
    }
}
