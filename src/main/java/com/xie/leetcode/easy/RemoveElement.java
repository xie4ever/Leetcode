package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/15 18:21
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[index] != val) {
                index++;
            } else {
                for (int j = index; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        RemoveElement removeElement = new RemoveElement();
        System.out.println(removeElement.removeElement(nums, 2));
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
