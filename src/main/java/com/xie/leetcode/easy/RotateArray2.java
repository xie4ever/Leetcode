package com.xie.leetcode.easy;

/**
 * @author xie4ever
 * @date 2018/11/28 18:33
 */
public class RotateArray2 {

    public void rotate(int[] nums, int k) {
        int r = k;
        if (k > nums.length) {
            r = k % nums.length;
        }
        if (r == 0) {
            return;
        }

        int[] temp = nums.clone();
        for (int j = 0; j < nums.length; j++) {
            if (j + r <= nums.length - 1) {
                nums[j + r] = temp[j];
            } else {
                nums[j + r - nums.length] = temp[j];
            }
        }
    }

    public static void main(String[] args) {
        RotateArray2 rotateArray = new RotateArray2();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6};
        rotateArray.rotate(nums, 2);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
