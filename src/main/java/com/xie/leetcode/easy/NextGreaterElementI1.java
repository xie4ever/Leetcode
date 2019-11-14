package com.xie.leetcode.easy;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author xie4ever
 * @date 2019/7/27 15:55
 */
public class NextGreaterElementI1 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> hasMap = new HashMap<Integer, Integer>();

        int[] result = new int[nums1.length];

        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                hasMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) result[i] = hasMap.getOrDefault(nums1[i], -1);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new NextGreaterElementI1().nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7});
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
