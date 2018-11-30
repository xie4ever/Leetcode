package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/28 18:33
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int[] temp = nums.clone();
            for (int j = 0; j < nums.length; j++) {
                if (j == 0) {
                    nums[0] = temp[nums.length - 1];
                    continue;
                }
                nums[j] = temp[j-1];
            }
        }
    }

    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = new int[]{1, 2, 3};
        rotateArray.rotate(nums, 3);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
