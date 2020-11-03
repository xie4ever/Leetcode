package com.xie.leetcode.easy;

import java.util.HashMap;

/**
 * @author xie4ever
 * @date 2019/7/27 15:05
 */
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            Integer max = null;

            for (int j = i + 1; j < nums2.length; j++) {
                if (max == null && nums2[j] > nums2[i]) {
                    max = nums2[j];
                    continue;
                }
            }

            hashMap.put(nums2[i], max);
        }

        for (int i = 0; i < nums1.length; i++) {
            Integer next = hashMap.get(nums1[i]);
            if (next == null || next < nums1[i]) {
                nums1[i] = -1;
            } else {
                nums1[i] = next;
            }
        }

        return nums1;
    }

    public static void main(String[] args) {
        int[] nums = new NextGreaterElementI().nextGreaterElement(new int[]{1, 3, 5, 2, 4}, new int[]{6, 5, 4, 3, 2, 1, 7});
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
